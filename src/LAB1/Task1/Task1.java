package LAB1.Task1;

import java.util.Scanner;

class UserAge{
    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо вік користувача
        System.out.print("Введіть ваш вік: ");
        int age = scanner.nextInt(); // Зчитуємо введене число

        // Виводимо повідомлення про вік
        System.out.println("Ваш вік: " + age + " років.");

        // Закриваємо Scanner
        scanner.close();
    }
}
