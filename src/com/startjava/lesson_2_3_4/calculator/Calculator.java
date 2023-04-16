package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int[] nums = new int[2];
    private char sign;

    public double calculate(String mathExpression) {
        parseMathExpression(mathExpression);
        switch(sign) {
            case '+':
                return Math.addExact(nums[0], nums[1]);
            case '-':
                return Math.subtractExact(nums[0], nums[1]);
            case '*':
                return Math.multiplyExact(nums[0], nums[1]);
            case '/':
                return (double) nums[0] / nums[1];
            case '^':
                return Math.pow(nums[0], nums[1]);
            case '%':
                return Math.IEEEremainder(nums[0], nums[1]);
            default:
                throw new IllegalArgumentException("Знак математического выражения не состоит из символов: +-*/^%");
        }
    }

    public void parseMathExpression(String mathExpression) {
        String[] partsExpression = mathExpression.split(" ");

        if (partsExpression.length != 3) {
            throw new IllegalArgumentException("Некорректный ввод математического выражения!");
        }

        sign = partsExpression[1].charAt(0);
        nums[0] = Integer.parseInt(partsExpression[0]);
        nums[1] = Integer.parseInt(partsExpression[2]);

        if (sign == '/' && nums[1] == 0) {
            throw new ArithmeticException("Делить на ноль нельзя!");
        }
    }
}