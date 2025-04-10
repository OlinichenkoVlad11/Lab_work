package LAB5.task4;

import java.util.Random;
import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberOfDice;
        int totalSum = 0;

        // Запит у користувача
        System.out.print("Введіть кількість кубиків: ");
        numberOfDice = scanner.nextInt();

        // Перевірка введеного значення
        if (numberOfDice <= 0) {
            System.out.println("Кількість кубиків повинна бути більше 0!");
            scanner.close();
            return;
        }

        // Симуляція кидків кубиків
        for (int i = 0; i < numberOfDice; i++) {
            int roll = random.nextInt(6) + 1; // Генеруємо випадкове число від 1 до 6
            totalSum += roll;
            print(roll);
        }

        // Виведення підсумкової суми
        System.out.println("Загальна сума: " + totalSum);

        // Закриття Scanner
        scanner.close();
    }

    // Метод для виведення ASCII-арту кубика
    static void print(int roll) {
        String[] diceFaces = {
                " ----- \n|     |\n|  *  |\n|     |\n ----- ",
                " ----- \n| *   |\n|     |\n|   * |\n ----- ",
                " ----- \n| *   |\n|  *  |\n|   * |\n ----- ",
                " ----- \n| * * |\n|     |\n| * * |\n ----- ",
                " ----- \n| * * |\n|  *  |\n| * * |\n ----- ",
                " ----- \n| * * |\n| * * |\n| * * |\n ----- "
        };

        System.out.println(diceFaces[roll - 1]);
    }
}
