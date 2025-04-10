package LAB5.task6;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"камінь", "папір", "ножиці"};

        boolean playAgain = true;
        while (playAgain) {
            // Запит у користувача вибору
            String playerChoice;
            while (true) {
                System.out.print("Введіть ваш вибір (камінь, папір, ножиці): ");
                playerChoice = scanner.nextLine().toLowerCase();
                if (playerChoice.equals("камінь") || playerChoice.equals("папір") || playerChoice.equals("ножиці")) {
                    break;
                }
                System.out.println("Некоректне значення, спробуйте ще раз.");
            }

            // Генерація вибору комп'ютера
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Комп'ютер вибрав: " + computerChoice);

            // Визначення переможця
            if (playerChoice.equals(computerChoice)) {
                System.out.println("Нічия!");
            } else if ((playerChoice.equals("камінь") && computerChoice.equals("ножиці")) ||
                    (playerChoice.equals("ножиці") && computerChoice.equals("папір")) ||
                    (playerChoice.equals("папір") && computerChoice.equals("камінь"))) {
                System.out.println("Ви виграли!");
            } else {
                System.out.println("Комп'ютер виграв!");
            }

            // Запит про повтор гри
            System.out.print("Хочете зіграти ще раз? (так/ні): ");
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("так");
        }

        // Закінчення гри
        System.out.println("Дякую що зіграли!");
        scanner.close();
    }
}

