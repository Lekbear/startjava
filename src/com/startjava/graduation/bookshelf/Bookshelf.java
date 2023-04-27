package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    static final int MAX_BOOKS = 10;
    private int countBooks = 0;
    private int maxLength = 0;
    private Book[] books = new Book[MAX_BOOKS];

    int getCountBooks() {
        return countBooks;
    }

    int getMaxLength() {
        return maxLength;
    }

    Book[] getBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    boolean deleteBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                if (books[i].getLength() == maxLength) {
                    refreshMaxLength(i);
                }
                System.arraycopy(books, i + 1, books, i, countBooks - i - 1);
                books[countBooks - 1] = null;
                countBooks--;
                return true;
            }
        }
        return false;
    }

    void refreshMaxLength(int index) {
        maxLength = 0;
        for (int i = 0; i < countBooks; i++) {
            if (i != index) maxLength = Math.max(maxLength, books[i].getLength());
        }
    }

    boolean saveBook(String author, String title, int publishYear) {
        if (countBooks < MAX_BOOKS) {
            int length = author.length() + title.length() + Integer.toString(publishYear).length() + 4;
            books[countBooks++] = new Book(author, title, publishYear, length);
            maxLength = Math.max(maxLength, length);
            return true;
        }
        return false;
    }

    Book findBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        maxLength = 0;
    }
}
