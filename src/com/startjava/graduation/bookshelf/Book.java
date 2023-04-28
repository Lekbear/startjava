package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int year;
    private int length;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        length = author.length() + title.length() + Integer.toString(year).length() + 4;
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
