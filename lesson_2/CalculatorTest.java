import java.util.Scanner;

public class CalculatorTest {
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = YES;

        do {
            System.out.print("Введите первое число: ");
            int number1 = scanner.nextInt();
            calculator.setNumber1(number1);
            scanner.nextLine();

            do {
                System.out.print("Введите знак математической операции: ");
                char sign = scanner.nextLine().charAt(0);
                calculator.setSign(sign);
            } while (calculator.getError() != 0);
            
            do {
                System.out.print("Введите второе число: ");
                int number2 = scanner.nextInt();
                calculator.setNumber2(number2);
            } while (calculator.getError() != 0);

            calculator.calculate();
            System.out.println("Результат: " + calculator.getResult());
            scanner.nextLine();
            
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while(answer.equals(YES) == false && answer.equals(NO) == false);

        } while (answer.equals(YES));
    }
}