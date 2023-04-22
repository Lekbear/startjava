package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int[] nums = new int[2];
    private static char sign;

    public static double calculate(String mathExpression) {
        parseMathExpression(mathExpression);
        return switch (sign) {
            case '+' -> Math.addExact(nums[0], nums[1]);
            case '-' -> Math.subtractExact(nums[0], nums[1]);
            case '*' -> Math.multiplyExact(nums[0], nums[1]);
            case '/' -> (double) nums[0] / nums[1];
            case '^' -> Math.pow(nums[0], nums[1]);
            case '%' -> Math.IEEEremainder(nums[0], nums[1]);
            default -> throw new IllegalArgumentException("Некорректный знак мат. выражения!");
        };
    }

    private static void parseMathExpression(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");

        if (partsExpression.length != 3) {
            throw new IllegalArgumentException("Некорректный ввод математического выражения!");
        }

        sign = partsExpression[1].charAt(0);
        nums[0] = Integer.parseInt(partsExpression[0]);
        nums[1] = Integer.parseInt(partsExpression[2]);

        if (nums[0] < 0 || nums[1] < 0) {
            throw new IllegalArgumentException("Необходимо вводить положительные числа!");
        }

        if (sign == '/' && nums[1] == 0) {
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
    }
}