package LAB3.task2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int secretNumber = 7;
        int userGuess;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Вгадайте число від 1 до 10: ");
            userGuess = scanner.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Загадане число більше.");
            } else if (userGuess > secretNumber) {
                System.out.println("Загадане число менше.");
            } else {
                System.out.println("Вітаємо! Ви вгадали число.");
            }
        } while (userGuess != secretNumber);

        scanner.close();
    }
}

