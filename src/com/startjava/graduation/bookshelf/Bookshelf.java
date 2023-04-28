package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    static final int MAX_BOOKS = 10;
    private int countBooks;
    private int maxLength;
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

    boolean delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                if (books[i].getLength() == maxLength) {
                    refreshMaxLength(i);
                }
                countBooks--;
                System.arraycopy(books, i + 1, books, i, countBooks - i);
                books[countBooks] = null;
                return true;
            }
        }
        return false;
    }

    boolean save(Book book) {
        if (countBooks < MAX_BOOKS) {
            books[countBooks] = book;
            maxLength = Math.max(maxLength, books[countBooks++].getLength());
            return true;
        }
        return false;
    }

    Book find(String title) {
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

    private void refreshMaxLength(int index) {
        maxLength = 0;
        for (int i = 0; i < countBooks; i++) {
            if (i != index) maxLength = Math.max(maxLength, books[i].getLength());
        }
    }
}
