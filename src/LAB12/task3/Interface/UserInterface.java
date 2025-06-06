package LAB12.task3.Interface;

import LAB12.task3.Users.User;
import LAB12.task3.list.Library;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Library library;
    private User user;

    public UserInterface(Library library, User user) {
        this.library = library;
        this.user = user;
    }

    public void handleChoice(int choice) {
        switch (choice) {
            case 1 -> borrowBook();
            case 2 -> returnBook();
            case 3 -> exitApp();
            default -> System.out.println("Невірний вибір.");
        }
    }

    public void borrowBook() {
        System.out.print("Введи ключове слово для пошуку: ");
        String keyword = scanner.nextLine();
        var results = library.searchByTitle(keyword);
        if (results.isEmpty()) {
            System.out.println("Не знайдено.");
        } else {
            System.out.println("Вибери номер предмета для запозичення:");
            for (int i = 0; i < results.size(); i++) {
                System.out.println((i + 1) + ". " + results.get(i).getInfo());
            }
            int index = scanner.nextInt() - 1;
            scanner.nextLine(); // Clear buffer
            if (index >= 0 && index < results.size()) {
                user.borrowItem(results.get(index));
                System.out.println("Книга позичена.");
            } else {
                System.out.println("Невірний вибір.");
            }
        }
    }

    public void returnBook() {
        var items = user.getBorrowedItems();
        if (items.isEmpty()) {
            System.out.println("Ти не маєш запозичених книг.");
            return;
        }

        System.out.println("Вибери номер для повернення книги:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i).getInfo());
        }

        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Clear buffer
        if (index >= 0 && index < items.size()) {
            user.returnItem(items.get(index));
            System.out.println("Книга повернута.");
        } else {
            System.out.println("Невірний вибір.");
        }
    }

    public void exitApp() {
        System.out.println("Ти вийшов з типу 'бібліотеки'. Бувай!");
        System.exit(0);
    }
}