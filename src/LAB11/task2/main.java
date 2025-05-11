package LAB11.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> tasks = new ArrayList<>();
    private static final List<Boolean> taskStatus = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = getUserChoice();
            handleUserChoice(choice);
        }
    }

    private static void showMenu() {
        System.out.println("\nTo-Do Лист:");
        System.out.println("1. Лист завдань");
        System.out.println("2. Додати завдання");
        System.out.println("3. Позначити завдання як виконане");
        System.out.println("4. Видалити завдання");
        System.out.println("5. Вихід");
        System.out.print("Вибрати налаштування: ");
    }

    private static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Невірний вхід. Будь ласка, введіть номер.");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextInt();
    }

    private static void handleUserChoice(int choice) {
        scanner.nextLine();
        switch (choice) {
            case 1 -> listTasks();
            case 2 -> addTask();
            case 3 -> markTaskAsDone();
            case 4 -> deleteTask();
            case 5 -> exitApp();
            default -> System.out.println("Недійсний варіант. Спробуйте знову.");
        }
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Немає доступних завдань.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                String status = taskStatus.get(i) ? "[Готово] " : "[В очікуванні] ";
                System.out.println((i + 1) + ". " + status + tasks.get(i));
            }
        }

    }
    private static void addTask() {
        System.out.print("Введіть завдання: ");
        String task = scanner.nextLine();
        tasks.add(task);
        taskStatus.add(false);
        System.out.println("Завдання додано!");
    }
    private static void markTaskAsDone() {
        System.out.print("Введіть номер завдання, щоб позначити його як виконане: ");
        int doneIndex = getValidIndex();
        if (doneIndex != -1) {
            taskStatus.set(doneIndex, true);
            System.out.println("Завдання позначено як виконане!");
        }
    }
    private static int getValidIndex() {
        while (!scanner.hasNextInt()) {
            System.out.println("Невірний вхід. Введіть дійсний номер завдання.");
            scanner.next();
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Недійсний номер завдання.");
            return -1;
        }
        return index;
    }
    private static void deleteTask() {
        System.out.print("Введіть номер завдання для видалення: ");
        int deleteIndex = getValidIndex();
        if (deleteIndex != -1) {
            tasks.remove(deleteIndex);
            taskStatus.remove(deleteIndex);
            System.out.println("Завдання видалено!");
        }
    }
    private static void exitApp() {
        System.out.println("Вихід...");
        scanner.close();
        System.exit(0);
    }
}