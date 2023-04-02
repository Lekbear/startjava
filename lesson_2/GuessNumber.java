import java.util.Scanner;

public class GuessNumber {
    private final int left = 1;
    private final int right = 101;
    private Player player1;
    private Player player2;
    private int hiddenNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        hiddenNumber = (int) (Math.random() * (right - left) + left);
        System.out.println("Компьютер загадал число");
    }

    public void start() {
        while (true) {
            guessNumber(player1);
            if (compareNumbers(player1)) {
                break;
            }  

            guessNumber(player2);
            if (compareNumbers(player2)) {
                break;
            }
        }
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал загаданное число");
            return true;
        }

        if (player.getNumber() > hiddenNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        } 
        return false;
    }

    public void guessNumber(Player player) {
        System.out.print("Попытка игрока " + player.getName() + " угадать число: ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number >= left && number <= right - 1) {
                    player.setNumber(number);
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