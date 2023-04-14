package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = YES;

        while (!NO.equals(answer)) {
            if (YES.equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                if (!calculator.parseMathExpression(scanner.nextLine())) {
                    continue;
                }

                double result = calculator.calculate();
                System.out.print("Результат: ");
                if ((result - Math.floor(result)) * 1000 == 0) {
                    System.out.printf("%.0f%n", result);
                } else {
                    System.out.printf("%.3f%n", result);
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }
}