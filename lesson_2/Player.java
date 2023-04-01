import java.util.Scanner;

public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void guessNumber(int left, int right) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= left && number <= right - 1) {
                    break;
                }
                System.out.print("Число нужно вводить в диапазоне (" + (left - 1) + ", " + 
                        (right - 1) + "]: ");
            } catch (NumberFormatException e) {
                System.out.print("Неверный ввод!\nНужно ввести число: ");
            }
        }
    }
}