package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import static java.lang.Math.max;

public class GuessNumber {
    public static final int LEFT = 0;
    public static final int RIGHT = 100;
    private static final int COUNT_ROUND = 3;
    private Player[] players;
    private int hiddenNumber;

    public GuessNumber(Player ... players) {
        this.players = players;
        clearPlayers(true);
        shuffleFisherYates();
        printSequenceGuessing();
    }

    private void clearPlayers(boolean clearScore) {
        for (Player player : players) {
            player.clear(clearScore);
        }
    }

    private void shuffleFisherYates() {
        int countPlayers = GuessNumberTest.COUNT_PLAYERS;
        while (countPlayers > 1) {
            int randomPos = (int) (Math.random() * countPlayers);
            Player randomPlayer = players[randomPos];
            players[randomPos] = players[countPlayers - 1];
            players[countPlayers - 1] = randomPlayer;
            countPlayers--;
        }
    }

    private void printSequenceGuessing() {
        System.out.println("По результатам жребия, порядок игроков для угадывания чисел, следующий: ");
        for (int i = 0; i < players.length; i++) {
            System.out.printf(i != players.length - 1 ? "%s, " : "%s", players[i].getName());
        }
        System.out.println();
    }

    public void start() {
        for (int i = 0; i < COUNT_ROUND; i++) {
            hiddenNumber = (int) (Math.random() * (RIGHT - LEFT) + 1);
            System.out.printf("Компьютер загадал число\nУ каждого игрока по %d попыток%nНачало %d-го раунда%n",
                        Player.MAX_ATTEMPT, i + 1);
            while (true) {
                if (!makeMove()) break;
            }
            printAttempts();
            clearPlayers(false);
        }
        determineWinner();
    }

    private boolean makeMove() {
        boolean done = false;
        for (Player player : players) {
            if (player.hasAttempt()) {
                guessNumber(player);
                done = true;
                if (compareNumbers(player)) {
                    return false;
                }
                continue;
            }
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return done;
    }

    private void guessNumber(Player player) {
        System.out.print("Попытка игрока " + player.getName() + " угадать число: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (player.setNumber(number)) {
                    break;
                }
                System.out.print("Число нужно вводить в диапазоне (" + LEFT + ", " + RIGHT + "]: ");
            } catch (NumberFormatException e) {
                System.out.print("Неверный ввод!\nНужно ввести число: ");
            }
        }
    }

    private boolean compareNumbers(Player player) {
        if (player.getLastNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber + " с " +
                        player.getCountAttempt() + " попытки");
            player.setScore(player.getScore() + 1);
            return true;
        }
        System.out.printf("Число %d %s того, что загадал компьютер%n", player.getLastNumber(),
                    player.getLastNumber() > hiddenNumber ? "больше" : "меньше");
        return false;
    }

    private void printAttempts() {
        for (Player player : players) {
            System.out.println("Все попытки игрока " + player.getName() + ":");
            for (int number : player.getNumbers()) {
                System.out.printf("%d ", number);
            }
            System.out.println();
        }
    }

    private void determineWinner() {
        int maxScore = players[0].getScore();
        for (Player player : players) {
            maxScore = max(maxScore, player.getScore());
        }

        int countWinners = 0;
        for (Player player : players) {
            if (player.getScore() == maxScore) countWinners++;
        }

        System.out.printf("В игре %s ", countWinners > 1 ? "победили игроки:" : "победил игрок");
        for (Player player: players) {
            if (player.getScore() == maxScore) {
                System.out.printf("%s ", player.getName());
            }
        }
        System.out.println();
    }
}