package LAB11.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        List<Boolean> taskStatus = new ArrayList<>();
        while (true) {
            System.out.println("\nМеню диспетчера завдань:");
            System.out.println("1. Переглянути завдання");
            System.out.println("2. Додати завдання");
            System.out.println("3. Позначити завдання як виконане");
            System.out.println("4. Видалити завдання");
            System.out.println("5. вихід");
            System.out.print("Виберіть варіант: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //
            switch (choice) {
                case 1:
                    // Відображення всіх задач
                    if (tasks.isEmpty()) {
                        System.out.println("Задачі відсутні.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            String status = taskStatus.get(i) ? "[Виконано]" : "[Не виконано]";
                            System.out.println((i + 1) + ". " + status + tasks.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.print("Введіть завдання: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    taskStatus.add(false);
                    System.out.println("Завдання додано!");
                    break;
                case 3:
                    System.out.print("Введіть номер завдання, щоб позначити його як виконане: ");
                    int doneIndex = scanner.nextInt() - 1;
                    if (doneIndex >= 0 && doneIndex < tasks.size()) {
                        taskStatus.set(doneIndex, true);
                        System.out.println("Завдання позначено як виконане!");
                    } else {
                        System.out.println("Недійсний номер завдання.");
                    }
                    break;
                case 4:
                    System.out.print("Введіть номер завдання для видалення: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
                        tasks.remove(deleteIndex);
                        taskStatus.remove(deleteIndex);
                        System.out.println("Завдання видалено!");
                    }else {
                        System.out.println("Завдання видалено.");
                    }
                    break;
                case 5:
                    System.out.println("Вихід...");
                    scanner.close();
                    return;
                default:    System.out.println("Недійсний варіант. Спробуйте знову.");
            }
        }

    }
}









