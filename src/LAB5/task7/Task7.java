package LAB5.task7;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100;
        int bet;
        int win;
        String choice = "yes";

        System.out.println("Вітаємо у грі Слот-машина!");
        System.out.println("Можливі символи: 🍒, 🍋, 🍊, 🏆, ⚓");
        System.out.println("----------------------------------");

        do {
            System.out.println("Ваш поточний баланс: $" + balance);
            System.out.print("Введіть ставку: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Помилка! Введіть числове значення");
                scanner.nextLine();
            }
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet <= 0) {
                System.out.println("Введіть коректну ставку (більше 0)");
                continue;
            }
            if (bet > balance) {
                System.out.println("Недостатньо коштів");
                continue;
            }

            balance -= bet;

            String[] result = spinRow();
            printRow(result);

            win = getPayout(result, bet);
            balance += win;

            if (win > 0) {
                System.out.println("Вітаємо! Ви виграли $" + win + "!");
            } else {
                System.out.println("На жаль, ви не виграли цього разу.");
            }

            System.out.println("Ваш поточний баланс: $" + balance);

            if (balance == 0) {
                System.out.println("Ваш баланс вичерпано. Гра завершена.");
                break;
            }

            System.out.println("Бажаєте продовжити гру (yes/no)?");
            choice = scanner.nextLine().toLowerCase();

            while (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Помилка! Оберіть yes або no");
                System.out.println("Бажаєте продовжити гру (yes/no)?");
                choice = scanner.nextLine().toLowerCase();
            }
        } while (choice.equals("yes"));

        System.out.println("Дякуємо за гру! Ваш фінальний баланс: $" + balance);
        scanner.close();
    }

    static String[] spinRow() {
        Random random = new Random();
        String[] symbols = {"🍒", "🍋", "🍊", "🏆", "⚓"};
        String[] result = new String[3];

        for (int i = 0; i < 3; i++) {
            result[i] = symbols[random.nextInt(symbols.length)];
        }

        return result;
    }

    static void printRow(String[] row) {
        System.out.println("-------------");
        System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
        System.out.println("-------------");
    }

    static int getPayout(String[] row, int bet) {
        // Перевірка на 3 однакові символи
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            switch (row[0]) {
                case "🍒": return bet * 3;
                case "🍋": return bet * 4;
                case "🍊": return bet * 5;
                case "🏆": return bet * 10;
                case "⚓": return bet * 100;
                default: return 0;
            }
        }

        // Перевірка на 2 однакові символи
        if (row[0].equals(row[1]) || row[0].equals(row[2]) || row[1].equals(row[2])) {
            String symbol;
            if (row[0].equals(row[1]) || row[0].equals(row[2])) {
                symbol = row[0];
            } else {
                symbol = row[1];
            }

            switch (symbol) {
                case "🍒": return bet * 2;
                case "🍋": return bet * 3;
                case "🍊": return bet * 4;
                case "🏆": return bet * 5;
                case "⚓": return bet * 6;
                default: return 0;
            }
        }

        return 0;
    }
}