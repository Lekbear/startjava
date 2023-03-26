public class Calculator {
    private int number1;
    private int number2;
    private char sign;
    private int result;
    private int error = 0;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        error = 0;
        if (sign == '/' && number2 == 0) {
            System.out.println("Делить на ноль нельзя!!!");
            error = 1;
        } else {
            this.number2 = number2;
        }
    }

    public void setSign(char sign) {
        error = 0;
        if (sign != '+' && sign != '-' && sign != '*' && sign != '/' && sign != '^' && sign != '%') {
            System.out.println("Введенная мат. операция не поддерживается");
            error = 1;
        } else {
            this.sign = sign;
        }
    }

    public int getResult() {
        return result;
    }

    public int getError() {
        return error;
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
                binpow(number1, number2);
                break;
            case '%':
                result = number1 % number2;
                break;
        }
    }

    public void binpow(int a, int n) {
        result = 1;
        while (n != 0) {
            if (n % 2 == 1) {
                result *= a;
            }
            a *= a;
            n /= 2;
        }
    }
}