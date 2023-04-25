package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    static final int COUNT_PLAYERS = 3;
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        System.out.println("""
                Игра "Угадай число"
                Правила игры:
                1. В игре участвуют три игрока, которые по очереди будут пытаться угадать число, загаданное компьютером
                2. Ход к следующему игроку переходит после неудачного угадывания текущего игрока
                3. Одержать победу может только один игрок
                4. Игра продолжается до тех пор, пока число не будет угадано
                5. В игре должны использоваться только целые положительные числа в полуинтервале (0, 100]""");

        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers(scanner));
        String answer = YES;

        while (!NO.equals(answer)) {
            if (YES.equals(answer)) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }

    private static Player[] createPlayers(Scanner scanner) {
        Player[] players = new Player[COUNT_PLAYERS];
        for (int i = 0; i < players.length; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го игрока : ");
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}