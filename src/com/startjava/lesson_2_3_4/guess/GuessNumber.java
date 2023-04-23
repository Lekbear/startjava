package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    protected static final int LEFT = 0;
    protected static final int RIGHT = 100;
    private Player[] players;
    private int hiddenNumber;

    public GuessNumber(Player[] players) {
        this.players = players;
        freePlayers();
        hiddenNumber = (int) (Math.random() * (RIGHT - LEFT) + 1);
        System.out.println("Компьютер загадал число\nУ каждого игрока по " + Player.MAX_ATTEMPT + " попыток");
    }

    private void freePlayers() {
        for (Player player : players) {
            player.free();
        }
    }

    protected void start() {
        while (true) {
            if (!makeMove()) break;
        }
        printAttempts();
    }

    private boolean makeMove() {
        boolean done = false;
        for (Player player : players) {
            if (player.checkCountAttempt()) {
                guessNumber(player);
                done = true;
                if (compareNumbers(player)) {
                    return false;
                }
            }
        }
        return done;
    }

    private void guessNumber(Player player) {
        System.out.print("Попытка игрока " + player.getName() + " угадать число: ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (player.setNumbers(number)) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Неверный ввод!\nНужно ввести число: ");
            }
        }
    }

    private boolean compareNumbers(Player player) {
        if (player.takeLastNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " с " +
                        player.getCountAttempt() + " попытки");
            return true;
        }

        if (player.takeLastNumber() > hiddenNumber) {
            System.out.println("Число " + player.takeLastNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.takeLastNumber() + " меньше того, что загадал компьютер");
        } 
        return false;
    }

    private void printAttempts() {
        for (Player player : players) {
            player.printNumbers();
        }
    }
}