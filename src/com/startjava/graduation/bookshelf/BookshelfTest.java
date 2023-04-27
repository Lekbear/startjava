package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final String DELETE_BOOK = "delete";
    private static final String SAVE_BOOK = "save";
    private static final String FIND_BOOK = "find";
    private static final String CLEAR_BOOKSHELF = "clear";
    private static final String QUIT = "quit";
    private static Bookshelf bookshelf = new Bookshelf();
    private static Scanner scanner = new Scanner(System.in);
    private static boolean exit = false;

    public static void main(String[] args) {
        while (!exit) {
            try {
                printInfoBookshelf();
                printMenu();
                selectionMenu();
                pressedEnter();
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования из строки в число");
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректный ввод! " + e.getMessage());
            }
        }
    }

    private static void printInfoBookshelf() {
        System.out.println("В шкафу " + bookshelf.getCountBooks() + " книга(и) и свободно " + (Bookshelf.MAX_BOOKS -
                bookshelf.getCountBooks()) + " полок");
        if (bookshelf.getCountBooks() > 0) {
            for (Book book : bookshelf.getBooks()) {
                printBookshelf(book);
            }
            if (bookshelf.getCountBooks() < Bookshelf.MAX_BOOKS) {
                printEmptyBookshelf();
            }
            System.out.println();
        } else {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    private static void printBookshelf(Book book) {
        int maxLength = bookshelf.getMaxLength();
        System.out.println("|" + book + " ".repeat(maxLength - book.getLength()) + "|");
        System.out.println("|" + "-".repeat(maxLength) + "|");
    }

    private static void printEmptyBookshelf() {
        System.out.println("|" + " ".repeat(bookshelf.getMaxLength()) + "|");
    }

    private static void printMenu() {
        System.out.println("""
                Menu:
                1. delete <title> (Removes the first occurrence)
                2. save <author> <title> <publishYear>
                3. find <title>
                4. clear
                5. quit""");
    }

    private static void selectionMenu() {
        System.out.println("Введите одну из доступных команд: ");
        String[] partsExpression = parse(scanner.nextLine());
        switch (partsExpression[0]) {
            case DELETE_BOOK -> deleteBook(partsExpression[1]);
            case SAVE_BOOK -> saveBook(partsExpression[1], partsExpression[2], Integer.parseInt(partsExpression[3]));
            case FIND_BOOK -> findBook(partsExpression[1]);
            case CLEAR_BOOKSHELF -> clearBookshelf();
            case QUIT -> exit = true;
            default -> throw new IllegalArgumentException("Введена неизвестная команда!");
        }
    }

    private static void pressedEnter() {
        System.out.println("Для продолжения работы нажмите Enter");
        scanner.nextLine();
    }

    private static String[] parse(String input) {
        String[] partsExpression = input.split(" ");

        if (partsExpression.length < 1) {
            throw new IllegalArgumentException("Нужно вводить одну из доступных команд");
        }

        if (DELETE_BOOK.equals(partsExpression[0]) && partsExpression.length != 2) {
            throw new IllegalArgumentException("Нужно вводить в формате: \"delete <title>\"");
        }

        if (SAVE_BOOK.equals(partsExpression[0]) && partsExpression.length != 4) {
            throw new IllegalArgumentException("Нужно вводить в формате: \"save <author> <title> <publishYear>\"");
        }

        if (FIND_BOOK.equals(partsExpression[0]) && partsExpression.length != 2) {
            throw new IllegalArgumentException("Нужно вводить в формате: \"find <title>\"");
        }

        if (CLEAR_BOOKSHELF.equals(partsExpression[0]) && partsExpression.length != 1) {
            throw new IllegalArgumentException("Нужно вводить в формате: \"clear\"");
        }

        if (QUIT.equals(partsExpression[0]) && partsExpression.length != 1) {
            throw new IllegalArgumentException("Нужно вводить в формате: \"quit\"");
        }

        return partsExpression;
    }

    private static void deleteBook(String title) {
        if (!bookshelf.deleteBook(title))
            System.out.println("Книга " + title + " не была удалена!");
    }

    private static void saveBook(String author, String title, int publishYear) {
        if (!bookshelf.saveBook(author, title, publishYear))
            System.out.println("Книга " + title + " не была сохранена!");
    }

    private static void findBook(String title) {
        Book book = bookshelf.findBook(title);
        if (book == null) {
            System.out.println("Книга " + title + " не была найдена!");
        } else {
            System.out.println("Найденная книга: " + book);
        }
    }

    private static void clearBookshelf() {
        bookshelf.clear();
    }
}
