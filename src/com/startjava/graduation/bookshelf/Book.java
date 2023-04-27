package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int year;
    private int length;

    public Book(String author, String title, int year, int length) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.length = length;
    }

    String getTitle() {
        return title;
    }

    int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return String.join(", ", author, title, Integer.toString(year));
    }
}
