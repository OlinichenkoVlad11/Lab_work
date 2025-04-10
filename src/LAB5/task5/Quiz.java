package LAB5.task5;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // Оголошення масивів запитань, варіантів відповідей та правильних відповідей
        String[] questions = {
                "Яка столиця Франції?",
                "Скільки планет у Сонячній системі?",
                "Який елемент має хімічний символ 'O'?",
                "Скільки континентів на Землі?",
                "Яка найбільша планета в Сонячній системі?"
        };

        String[][] options = {
                {"1. Берлін", "2. Париж", "3. Лондон", "4. Мадрид"},
                {"1. 7", "2. 8", "3. 9", "4. 10"},
                {"1. Водень", "2. Кисень", "3. Вуглець", "4. Азот"},
                {"1. 5", "2. 6", "3. 7", "4. 8"},
                {"1. Земля", "2. Сатурн", "3. Юпітер", "4. Марс"}
        };

        int[] correctAnswers = {2, 2, 2, 2, 3}; // Номери правильних відповідей
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        // Проходження через всі питання
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            // Зчитування відповіді користувача
            System.out.print("Введіть номер правильної відповіді: ");
            int answer = scanner.nextInt();

            //Перевірка правильності відповіді
            if (answer == correctAnswers[i]) {
                System.out.println("Правильно!\n");
                score++;
            } else {
                System.out.println("Неправильно!\n");
            }
        }

        // Виведення підсумкового рахунку
        System.out.println("Ваша підсумкова оцінка: " + score + " з " + questions.length);

        scanner.close();
    }
}


