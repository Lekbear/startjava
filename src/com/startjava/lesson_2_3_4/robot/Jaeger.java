package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {}

    public Jaeger(String modelName, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void printAttributes() {
        System.out.println("Параметры робота " + modelName + ":");
        System.out.println("Скорость: " + speed);
        System.out.println("Сила: " + strength);
        System.out.println("Броня: " + armor);
    }
}