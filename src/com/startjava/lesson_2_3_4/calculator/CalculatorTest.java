package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = YES;

        do {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            scanner.nextLine();

            do {
                System.out.print("Введите знак математической операции: ");
            } while (!calculator.setSign(scanner.nextLine().charAt(0)));
            
            do {
                System.out.print("Введите второе число: ");
            } while (!calculator.setNumber2(scanner.nextInt()));

            calculator.calculate();
            System.out.println("Результат: " + calculator.getResult());
            scanner.nextLine();
            
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals(YES) && !answer.equals(NO));
        } while (answer.equals(YES));
    }
}