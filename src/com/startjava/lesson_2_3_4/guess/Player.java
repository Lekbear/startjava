package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    protected static final int MAX_ATTEMPT = 10;
    private String name;
    private int[] numbers;
    private int countAttempt;

    protected Player(String name) {
        this.name = name;
        numbers = new int[MAX_ATTEMPT];
        countAttempt = 0;
    }

    protected String getName() {
        return name;
    }

    protected boolean setNumbers(int number) {
        if (number > GuessNumber.LEFT && number <= GuessNumber.RIGHT) {
            numbers[countAttempt++] = number;
            return true;
        }
        System.out.print("Число нужно вводить в диапазоне (" + GuessNumber.LEFT + ", " + GuessNumber.RIGHT + "]: ");
        return false;
    }

    protected int getCountAttempt() {
        return countAttempt;
    }

    protected boolean checkCountAttempt() {
        if (countAttempt == MAX_ATTEMPT) {
            System.out.println("У " + name + " закончились попытки");
        }
        return countAttempt < MAX_ATTEMPT;
    }

    protected int takeLastNumber() {
        return numbers[countAttempt - 1];
    }

    protected void printNumbers() {
        System.out.println("Все попытки игрока " + name + ":");
        for (int i = 0; i < countAttempt; i++) {
            System.out.printf("%d ", numbers[i]);
        }
        System.out.println();
    }

    protected void free() {
        countAttempt = 0;
        Arrays.fill(numbers, 0);
    }
}