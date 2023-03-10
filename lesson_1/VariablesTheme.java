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
        byte ram = 16;
        short shaders = 24;
        int busWidth = 128;
        long gpuСlock = 350;
        float pixelFillrate = 8.4f;
        double bandWidth = 42.7d;
        char rop = '8';
        boolean openCl = true;

        System.out.println("1. Вывод значений переменных на консоль");
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
        float penPrice = 100f;
        float bookPrice = 200f;
        float discount = 11f;
        float totalPriceNoDiscount = penPrice + bookPrice;
        float sumDiscount = totalPriceNoDiscount * discount / 100f;
        float totalPriceDiscount = totalPriceNoDiscount - sumDiscount;

        System.out.println("2. Расчет стоимости товара со скидкой");
        System.out.println("Общая стоимость товаров без скидки: " + totalPriceNoDiscount);
        System.out.println("Общая стоимость товаров со скидкой: " + sumDiscount);
        System.out.println("Сумма скидки: " + totalPriceDiscount + '\n');
    }

    private static void printJava() {
        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a\n");
    }

    private static void printMax() {
        byte numberByte = Byte.MAX_VALUE; 
        short numberShort = Short.MAX_VALUE;
        int numberInt = Integer.MAX_VALUE;
        long numberLong = Long.MAX_VALUE;

        System.out.println("4. Вывод min и max значений целых числовых типов");
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
        int number1 = 2;
        int number2 = 5;

        System.out.println("5. Перестановка значений переменных");
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
        char symbol1 = '#';
        char symbol2 = '&';
        char symbol3 = '@';
        char symbol4 = '^';
        char symbol5 = '_';

        int code_Symbol1 = symbol1;
        int code_Symbol2 = symbol2;
        int code_Symbol3 = symbol3;
        int code_Symbol4 = symbol4;
        int code_Symbol5 = symbol5;

        System.out.println("6. Вывод символов и их кодов");
        System.out.println("Код символа: " + code_Symbol1 + ", символ: " + symbol1);
        System.out.println("Код символа: " + code_Symbol2 + ", символ: " + symbol2);
        System.out.println("Код символа: " + code_Symbol3 + ", символ: " + symbol3);
        System.out.println("Код символа: " + code_Symbol4 + ", символ: " + symbol4);
        System.out.println("Код символа: " + code_Symbol5 + ", символ: " + symbol5 + '\n');
    }

    private static void printDuke() {
        String space6 = "      ";
        String space4 = "    ";
        String space3 = "   ";
        String space2 = "  ";
        String space1 = " ";

        char slashRight   = '/';
        char slashLeft    = '\\';
        char underLine    = '_';
        char bracketLeft  = '(';
        char bracketRight = ')'; 

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        System.out.println(space4 + slashRight + slashLeft + space4 + '\n' + 
                space3 + slashRight + space2 + slashLeft + space3 + '\n' + 
                space2 + slashRight + underLine + bracketLeft + space1 + bracketRight + slashLeft + 
                space2 + '\n' +  
                space1 + slashRight + space6 + slashLeft + space1 + '\n' + 
                slashRight + underLine + underLine + underLine + underLine +
                slashRight + slashLeft + underLine + underLine + slashLeft + '\n');
    }

    private static void printSumMulNumber() {
        int number = 123;
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        System.out.println("Число " + number + " содержит: ");
        
        int ones = number % 10;
        number /= 10;
        
        int tens = number % 10;
        number /= 10;

        int hundreds = number % 10;
        number /= 10;

        System.out.println(hundreds + " сотен");
        System.out.println(tens + " десяток");
        System.out.println(ones + " единиц\n");
        System.out.println("Сумма = " + ( ones + tens + hundreds ));
        System.out.println("Произведение = " + ones * tens * hundreds + '\n');
    }

    private static void printTime() {
        int seconds = 86399;
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;

        System.out.println("9. Вывод времени");
        System.out.println(hours + ':' + minutes + ':' + seconds);
    }
}