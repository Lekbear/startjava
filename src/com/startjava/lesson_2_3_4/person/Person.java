package com.startjava.lesson_2_3_4.person;

public class Person {
    String gender = "Мужской";
    String name = "Alexey";
    int height = 177;
    int weight = 77;
    int age = 24;

    private void move() {
        System.out.println("движемся");
    }

    private void sit() {
        System.out.println("сидим");
    }

    private void run() {
        System.out.println("бежим");
    }

    private void speak() {
        System.out.println("говорим");
    }

    private void learnJava() {
        System.out.println("Учим Java");
    }
}