import java.util.Scanner;

public class GuessNumber {
    private static final int LEFT = 0;
    private static final int RIGHT = 100;
    private Player player1;
    private Player player2;
    private int hiddenNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        hiddenNumber = (int) (Math.random() * (RIGHT - LEFT) + 1);
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

    private void guessNumber(Player player) {
        System.out.print("Попытка игрока " + player.getName() + " угадать число: ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (number > LEFT && number <= RIGHT) {
                    player.setNumber(number);
                    break;
                }
                System.out.print("Число нужно вводить в диапазоне (" + LEFT + ", " + RIGHT + "]: ");
            } catch (NumberFormatException e) {
                System.out.print("Неверный ввод!\nНужно ввести число: ");
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
}