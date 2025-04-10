package LAB5.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

    }

    static {
        Scanner scanner = new Scanner(System.in);

        // 2. Оголосіть змінні для збереження балансу та вибору користувача
        double balance = 0;
        int numberCase;
        // 3. Реалізуйте цикл, що буде повторюватися, доки користувач не вибере вихід
        do {
            System.out.println("1. Виводити поточний баланс.");
            System.out.println("2. Вносити кошти на рахунок.");
            System.out.println("3. Знімати кошти з рахунку.");
            System.out.println("4. Завершити роботу програми.");
            System.out.print("Введіть від 1 до 4 : ");
            numberCase = scanner.nextInt();
            // 4. Виведіть меню користувача
            // 5. Отримайте вибір користувача та обробіть його
            switch (numberCase) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = deposit(scanner, balance);
                    break;
                case 3:
                    balance = withdraw(scanner, balance);
                    break;
                case 4:
                    System.out.println("Завершення роботи програми!!!");
                    break;
                default:
                    System.out.println("Невірно обрана операція!!!");
                    System.out.println("Ви повинні внести число від 1 до 4 , не більше!!!");
            }
        } while (numberCase != 4);
        // 7. Закрийте Scanner
        scanner.close();
    }

    // 6. Реалізуйте методи showBalance(), deposit(), withdraw()
    // Метод для відображення балансу
    // Вивести поточний баланс
    static void showBalance(double balance) {
        System.out.println("Поточний баланс: " + balance);
    }

    // Метод для внесення коштів
    // Запросити суму для внесення, перевірити коректність та повернути її
    static double deposit(Scanner scanner, double balance) {
        System.out.print("Внести суму: ");
        double refill = scanner.nextDouble();
        if (refill > 0) {
            balance += refill;
            System.out.printf("Внесено: %.2f << Поточний баланс: %.2f", refill, balance);
            System.out.println();
        } else {
            System.out.println("Невірно введена сума поповнення!!!");
        }
        return refill;
    }

    // Метод для зняття коштів
    // Запросити суму для зняття, перевірити можливість зняття та повернути значення
    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Сума для зняття: ");
        double out = scanner.nextDouble();

        if (out > 0 && out <= balance) {
            balance -= out;
            System.out.printf("Знято: %.2f << Залишок на рахунку: %.2f", out, balance);
            System.out.println();
        } else if (out > balance) {
            System.out.println("Недостатньо коштів на рахунку!!!");
        }
        return balance;
    }
}
