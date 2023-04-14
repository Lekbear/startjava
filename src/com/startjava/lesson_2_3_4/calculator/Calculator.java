package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static final String OPERATIONS = "+-*/^%";
    private int[] nums = new int[2];
    private char sign;

    public boolean parseMathExpression(String mathExpression) {
        String[] expression = mathExpression.split(" ");

        if (expression.length != 3) {
            System.out.println("Некорректный ввод математического выражения!");
            return false;
        }

        if (expression[1].length() != 1 || !OPERATIONS.contains(expression[1])) {
            System.out.println("Знак математического выражения должен состоять из одного символа: " + OPERATIONS);
            return false;
        }

        sign = expression[1].charAt(0);

        try {
            nums[0] = Integer.parseInt(expression[0]);
            nums[1] = Integer.parseInt(expression[2]);
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод чисел!");
            return false;
        }

        if (sign == '/' && nums[1] == 0) {
            System.out.println("Делить на ноль нельзя!");
            return false;
        }

        return true;
    }
    public double calculate() {
        double result = 0.0d;
        switch(sign) {
            case '+':
                result = Math.addExact(nums[0], nums[1]);
                break;
            case '-':
                result = Math.subtractExact(nums[0], nums[1]);
                break;
            case '*':
                result = Math.multiplyExact(nums[0], nums[1]);
                break;
            case '/':
                result = (double) nums[0] / nums[1];
                break;
            case '^':
                result = Math.pow(nums[0], nums[1]);
                break;
            case '%':
                result = Math.IEEEremainder(nums[0], nums[1]);
                break;
        }
        return result;
    }
}