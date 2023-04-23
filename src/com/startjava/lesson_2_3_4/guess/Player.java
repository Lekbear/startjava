package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_ATTEMPT = 10;
    private String name;
    private int[] numbers;
    private int countAttempt;
    private int score;

    public Player(String name) {
        this.name = name;
        numbers = new int[MAX_ATTEMPT];
    }

    public String getName() {
        return name;
    }

    public boolean setNumber(int number) {
        if (number > GuessNumber.LEFT && number <= GuessNumber.RIGHT) {
            numbers[countAttempt++] = number;
            return true;
        }
        return false;
    }

    public int getCountAttempt() {
        return countAttempt;
    }

    public boolean hasAttempt() {
        return countAttempt < MAX_ATTEMPT;
    }

    public int getLastNumber() {
        return numbers[countAttempt - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempt);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void clear(boolean clearScore) {
        Arrays.fill(numbers, 0, countAttempt, 0);
        countAttempt = 0;
        if (clearScore) score = 0;
    }
}