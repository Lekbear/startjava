public class VariablesTheme {

    public static void main(String[] args) {
        printPrimitiveVariables();
        printCalcPrices();
        printJava();
        printMax();
        printSwapVariables();
        printCodesSymbols();
        printDuke();
        printSumMulNumber();
        printTime();
    }

    private static void printPrimitiveVariables() {
        System.out.println("1. Вывод значений переменных на консоль");

        byte ram = 16;
        short shaders = 24;
        int busWidth = 128;
        long gpuСlock = 350;
        float pixelFillrate = 8.4f;
        double bandWidth = 42.7d;
        char rop = '8';
        boolean openCl = true;

        System.out.println("Количество гигабайт оперативной памяти: " + ram);
        System.out.println("Количество шейдерных процессов в видеоадаптере: " + shaders);
        System.out.println("Ширина шины между графическим процессором и видеопамятью: " + busWidth);
        System.out.println("Текущая выбранная частота графического процессора: " + gpuСlock);
        System.out.println("Количество пикселей, которые могут быть просчитаны видеоадаптером " + 
                "за одну секунду: " + pixelFillrate);
        System.out.println("Эффективная пропускная способность шины между графическим процессором" + 
                " и видеопамятью: " + bandWidth);
        System.out.println("Количество блоков растровых операций в видеоадаптере: " + rop);
        System.out.println("Доступность технологии openCl в видеоадаптере: " + openCl + '\n');
    }

    private static void printCalcPrices() {
        System.out.println("2. Расчет стоимости товара со скидкой");

        float penPrice = 100f;
        float bookPrice = 200f;
        float sumPrice = penPrice + bookPrice;
        float discount = 11f;
        float discountSum = sumPrice * discount / 100f;
        float discountPrice = sumPrice - discountSum;

        System.out.println("Общая стоимость товаров без скидки: " + sumPrice);
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);
        System.out.println("Сумма скидки: " + discountSum + '\n');
    }

    private static void printJava() {
        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a\n");
    }

    private static void printMax() {
        System.out.println("4. Вывод min и max значений целых числовых типов");

        byte numberByte = Byte.MAX_VALUE; 
        short numberShort = Short.MAX_VALUE;
        int numberInt = Integer.MAX_VALUE;
        long numberLong = Long.MAX_VALUE;

        System.out.println("Byte, max = " + numberByte);
        System.out.println("Short, max = " + numberShort);
        System.out.println("Int, max = " + numberInt);
        System.out.println("Long, max = " + numberLong + '\n');

        System.out.println("Byte, max + 1 = " + ++numberByte);
        System.out.println("Short, max + 1 = " + ++numberShort);
        System.out.println("Int, max + 1 = " + ++numberInt);
        System.out.println("Long, max + 1 = " + ++numberLong + '\n');

        System.out.println("Byte, max + 1 - 1 = " + --numberByte);
        System.out.println("Short, max + 1 - 1 = " + --numberShort);
        System.out.println("Int, max + 1 - 1 = " + --numberInt);
        System.out.println("Long, max + 1 - 1 = " + --numberLong + '\n');
    }

    private static void printSwapVariables() {
        System.out.println("5. Перестановка значений переменных");

        int number1 = 2;
        int number2 = 5;

        System.out.println("5.1. C помощью третьей переменной:");
        System.out.println("Исходные значения: " + number1 + ", " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Новые значения: " + number1 + ", " + number2 + '\n');

        System.out.println("5.2. C помощью арифметических операций:");
        System.out.println("Исходные значения: " + number1 + ", " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("Новые значения: " + number1 + ", " + number2 + '\n');

        System.out.println("5.3. C помощью побитовой операции");
        System.out.println("Исходные значения: " + number1 + ", " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("Новые значения: " + number1 + ", " + number2 + '\n');
    }

    private static void printCodesSymbols() {
        System.out.println("6. Вывод символов и их кодов");

        char sharp = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';

        System.out.println("Код символа: " + (int) sharp + ", символ: " + sharp);
        System.out.println("Код символа: " + (int) ampersand + ", символ: " + ampersand);
        System.out.println("Код символа: " + (int) at + ", символ: " + at);
        System.out.println("Код символа: " + (int) caret + ", символ: " + caret);
        System.out.println("Код символа: " + (int) underscore + ", символ: " + underscore + '\n');
    }

    private static void printDuke() {
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");

        char slash   = '/';
        char backslash    = '\\';
        char underscore    = '_';
        char openParenthesis  = '(';
        char closeParenthesis = ')'; 

        System.out.println("    " + slash + backslash + "    ");
        System.out.println("   " + slash + "  " + backslash + "   ");
        System.out.println("  " + slash + underscore + openParenthesis + " " + closeParenthesis + 
                backslash + "  ");
        System.out.println(" " + slash + "      " + backslash + " ");
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash + "\n");
    }

    private static void printSumMulNumber() {
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");

        int number = 123;

        System.out.println("Число " + number + " содержит: ");

        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100 % 10;

        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десяток");
        System.out.println(ones + " единиц\n");
        System.out.println("Сумма = " + ( ones + tens + hundreds ));
        System.out.println("Произведение = " + ones * tens * hundreds + '\n');
    }

    private static void printTime() {
        System.out.println("9. Вывод времени");

        int seconds = 86399;
        System.out.println("" + seconds / 3600 + ':' + seconds / 60 % 60 + ':' + seconds % 60);
    }
}