package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Мужской");
        wolfOne.setName("Батлер");
        wolfOne.setColor("Черный");
        wolfOne.setWeight(100);
        wolfOne.setAge(8);
        System.out.println("Пол волка: " + wolfOne.getGender());
        System.out.println("Кличка волка: " + wolfOne.getName());
        System.out.println("Цвет волка: " + wolfOne.getColor());
        System.out.println("Вес волка: " + wolfOne.getWeight());
        System.out.println("Возраст волка: " + wolfOne.getAge());
        wolfOne.move();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}