package LAB11.task3;

import LAB11.task3.handlers.TaskHandler;
import LAB11.task3.services.TaskManager;
import java.util.Scanner;

public class MaIn {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        TaskHandler taskHandler = new TaskHandler(taskManager);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) {
                System.out.println("👋 Вихід зі списку справ. Гарного дня!");
                break;
            }
            taskHandler.handleUserChoice(choice);

        }
    }
    private static void displayMenu() {
        System.out.println("\nСписок справ");
        System.out.println("1. Додати завдання");
        System.out.println("2. Додати повторюване завдання");
        System.out.println("3. Додати завдання з високим пріоритетом");
        System.out.println("4. Список завдань");
        System.out.println("5. Позначити завдання як виконане");
        System.out.println("6. Видалити завдання");
        System.out.println("0. Вихід ");
        System.out.print("Виберіть опцію: ");
    }
}
