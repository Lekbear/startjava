package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private char sign;
    private int result;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public boolean setNumber2(int number2) {
        if (sign == '/' && number2 == 0) {
            System.out.println("Делить на ноль нельзя!!!");
            return false;
        } 
        this.number2 = number2;
        return true;
    }

    public boolean setSign(char sign) {
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '^' && sign != '%') {
            System.out.println("Введенная мат. операция не поддерживается");
            return false;
        }
        this.sign = sign;
        return true;
    }

    public int getResult() {
        return result;
    }

    public void calculate() {
        result = 0;
        switch(sign) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '^':
                binpow();
                break;
            case '%':
                result = number1 % number2;
                break;
        }
    }

    public void binpow() {
        result = 1;
        while (number2 != 0) {
            if (number2 % 2 == 1) {
                result *= number1;
            }
            number1 *= number1;
            number2 /= 2;
        }
    }
}