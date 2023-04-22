package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = YES;

        while (!NO.equals(answer)) {
            if (YES.equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                try {
                    double result = Calculator.calculate(scanner.nextLine());
                    printResult(result);
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка преобразования из строки в число");
                } catch (ArithmeticException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        }
    }

    private static void printResult(double result) {
        System.out.print("Результат: ");
        System.out.printf(result % 1 < 0.001d ? "%.0f%n" : "%.3f%n", result);
    }
}