package com.startjava.lesson_1.final_1;

public class Calculator {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 10;
        int result = 0;
        char sign = '^';

        if (sign == '+') {
            result = number1 + number2;
        } else if (sign == '-') {
            result = number1 - number2;
        } else if (sign == '*') {
            result = number1 * number2;
        } else if (sign == '/' && number2 != 0) {
            result = number1 / number2;
        } else if (sign == '^') {
            result = binpow(number1, number2);
        } else if (sign == '%') {
            result = number1 % number2;
        }

        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }

    public static int binpow(int a, int n) {
        int result = 1;
        while (n != 0) {
            if ((n & 1) == 1) {
                result *= a;
            }
            a *= a;
            n >>= 1;
        }
        return result;
    }
}