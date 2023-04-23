package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final String YES = "yes";
    private static final String NO = "no";
    private static final int COUNT_PLAYERS = 2;
    private static Player[] players = new Player[COUNT_PLAYERS];

    public static void main(String[] args) {
        System.out.println("""
                Игра "Угадай число"
                Правила игры:
                1. В игре участвуют два игрока, которые по очереди будут пытаться угадать число, загаданное компьютером, вводя его с клавиатуры
                2. Ход к следующему игроку переходит после неудачного угадывания текущего игрока
                3. Одержать победу может только один игрок
                4. Игра продолжается до тех пор, пока число не будет угадано
                5. В игре должны использоваться только целые положительные числа в полуинтервале (0, 100]""");

        Scanner scanner = new Scanner(System.in);
        createPlayers(scanner);
        String answer = YES;

        while (!NO.equals(answer)) {
            if (YES.equals(answer)) {
                GuessNumber game = new GuessNumber(players);
                game.start();
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
        scanner.close();
    }

    private static void createPlayers(Scanner scanner) {
        for (int i = 0; i < COUNT_PLAYERS; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го игрока : ");
            Player player = new Player(scanner.nextLine());
            players[i] = player;
        }
    }
}