package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    static final int MAX_ATTEMPT = 10;
    private String name;
    private int[] numbers;
    private int countAttempt;
    private int score;

    Player(String name) {
        this.name = name;
        numbers = new int[MAX_ATTEMPT];
    }

    String getName() {
        return name;
    }

    boolean setNumber(int number) {
        if (number >= GuessNumber.LEFT && number <= GuessNumber.RIGHT) {
            numbers[countAttempt++] = number;
            return true;
        }
        return false;
    }

    int getCountAttempt() {
        return countAttempt;
    }

    boolean hasAttempt() {
        return countAttempt < MAX_ATTEMPT;
    }

    int getLastNumber() {
        return numbers[countAttempt - 1];
    }

    int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempt);
    }

    int getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = score;
    }

    void clear() {
        Arrays.fill(numbers, 0, countAttempt, 0);
        countAttempt = 0;
    }
}