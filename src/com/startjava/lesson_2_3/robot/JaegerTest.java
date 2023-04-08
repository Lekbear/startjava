package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setSpeed(7);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);
        jaeger1.printAttributes();

        Jaeger jaeger2 = new Jaeger("Coyote Tango", 5, 7, 4);
        jaeger2.printAttributes();

        System.out.print("Общая сумма параметров " + jaeger1.getModelName() + " : ");
        System.out.println(jaeger1.getSpeed() + jaeger1.getStrength() + jaeger1.getArmor());
        System.out.print("Общая сумма параметров " + jaeger2.getModelName() + " : ");
        System.out.println(jaeger2.getSpeed() + jaeger2.getStrength() + jaeger2.getArmor());
    }
}