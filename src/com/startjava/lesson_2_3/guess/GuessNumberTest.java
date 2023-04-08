package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\"\nПравила игры:\n"
                + "1. В игре участвуют два игрока, которые по очереди будут пытаться угадать число,"
                + " загаданное компьютером, вводя его с клавиатуры\n"
                + "2. Ход к следующему игроку переходит после неудачного угадывания текущего игрока"
                + "\n3. Одержать победу может только один игрок\n"
                + "4. Игра продолжается до тех пор, пока число не будет угадано\n"
                + "5. В игре должны использоваться только целые положительные числа в полуинтервале"
                + " (0, 100]");

        Scanner scanner = new Scanner(System.in);
        String answer = YES;

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!YES.equals(answer) && !NO.equals(answer));
        } while (YES.equals(answer));
        scanner.close();
    }
}