package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    private static final String DELETE = "delete";
    private static final String SAVE = "save";
    private static final String FIND = "find";
    private static final String CLEAR_BOOKSHELF = "clear";
    private static final String QUIT = "quit";
    private static Bookshelf bookshelf = new Bookshelf();
    private static Scanner scanner = new Scanner(System.in);
    private static boolean active = true;

    public static void main(String[] args) {
        while (active) {
            try {
                printBookshelfInfo();
                printMenu();
                selectFromMenu();
                pressEnter();
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобразования из строки в число");
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректный ввод! " + e.getMessage());
            }
        }
    }

    private static void printBookshelfInfo() {
        if (bookshelf.getCountBooks() > 0) {
            System.out.println("В шкафу " + bookshelf.getCountBooks() + " книга(и) и свободно " +
                    (Bookshelf.MAX_BOOKS - bookshelf.getCountBooks()) + " полок");
            printBookshelf();
        } else {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    private static void printBookshelf() {
        for (Book book : bookshelf.getBooks()) {
            System.out.println("|" + book + " ".repeat(bookshelf.getMaxLength() - book.getLength()) + "|");
            System.out.println("|" + "-".repeat(bookshelf.getMaxLength()) + "|");
        }
        if (bookshelf.getCountBooks() < Bookshelf.MAX_BOOKS) {
            System.out.println("|" + " ".repeat(bookshelf.getMaxLength()) + "|");
        }
        System.out.println();
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

    private static void selectFromMenu() {
        System.out.println("Введите одну из доступных команд: ");
        String[] details = parse(scanner.nextLine());
        switch (details[0]) {
            case DELETE -> deleteBook(details[1]);
            case SAVE -> saveBook(details);
            case FIND -> findBook(details[1]);
            case CLEAR_BOOKSHELF -> clearBookshelf();
            case QUIT -> active = false;
            default -> throw new IllegalArgumentException("Введена неизвестная команда!");
        }
    }

    private static void pressEnter() {
        System.out.println("Для продолжения работы нажмите Enter");
        scanner.nextLine();
    }

    private static String[] parse(String input) {
        String[] partsExpression = input.split(" ");

        if (partsExpression.length < 1) {
            throw new IllegalArgumentException("Нужно вводить одну из доступных команд");
        }

        if (DELETE.equals(partsExpression[0]) && partsExpression.length != 2) {
            throw new IllegalArgumentException("Нужно вводить в формате: \"delete <title>\"");
        }

        if (SAVE.equals(partsExpression[0]) && partsExpression.length != 4) {
            throw new IllegalArgumentException("Нужно вводить в формате: \"save <author> <title> <publishYear>\"");
        }

        if (FIND.equals(partsExpression[0]) && partsExpression.length != 2) {
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
        if (!bookshelf.delete(title))
            System.out.println("Книга " + title + " не была удалена!");
    }

    private static void saveBook(String[] details) {
        if (!bookshelf.save(new Book(details[1], details[2], Integer.parseInt(details[3]))))
            System.out.println("Книга " + details[2] + " не была сохранена!");
    }

    private static void findBook(String title) {
        Book book = bookshelf.find(title);
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
