package LAB12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Book> library = new ArrayList<>();
    private static final List<Book> userBooks = new ArrayList<>();

    static class Book {
        String title;
        String author;
        int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return "\"" + title + "\" by " + author + " (" + year + ")";
        }
    }

    public static void main(String[] args) {
        initializeLibrary();

        while (true) {
            showMenu();
            int choice = getUserChoice();
            handleUserChoice(choice);
        }
    }

    private static void initializeLibrary() {
        library.add(new Book("" + "Великий Гетсбі", "Ф. Скотт Фіцджеральд", 1925));
        library.add(new Book("Вбити переспішника", "Харпер Ліі", 1960));
        library.add(new Book("1984", "Джордж Орвел", 1949));
        library.add(new Book("Гордість і упередження", "Джейн Аустен", 1813));
        library.add(new Book("Хоббіт", "Толкін", 1937));
    }

    private static void showMenu() {
        System.out.println("\nБібліотека:");
        System.out.println("1. Перегляд книг");
        System.out.println("2. Позичити книгу");
        System.out.println("3. Повернути книгу");
        System.out.println("4. Вихід");
        System.out.print("Виберіть опцію: ");
    }

    private static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Невірний ввід. Будь ласка, введіть номер.");
            scanner.next(); // Спожити невірний ввід
        }
        return scanner.nextInt();
    }

    private static void handleUserChoice(int choice) {
        scanner.nextLine(); // Спожити залишок рядка
        switch (choice) {
            case 1 -> listBooks();
            case 2 -> BorrowBook();
            case 3 -> ReturnBook();
            case 4 -> ExitApp();
            default -> System.out.println("Невірний варіант. Спробуйте знову.");
        }
    }

    private static void listBooks() {
        System.out.println("\nКниги в бібліотеці:");
        if (library.isEmpty()) {
            System.out.println("Немає доступних книг.");
        } else {
            for (int i = 0; i < library.size(); i++) {
                System.out.println((i + 1) + ". " + library.get(i));
            }
        }

        System.out.println("\nВаші позичені книги:");
        if (userBooks.isEmpty()) {
            System.out.println("Ви не позичали жодних книг.");
        } else {
            for (int i = 0; i < userBooks.size(); i++) {
                System.out.println((i + 1) + ". " + userBooks.get(i));
            }
        }
    }

    private static void BorrowBook() {
        if (library.isEmpty()) {
            System.out.println("Немає книг для позики.");
            return;
        }

        System.out.println("\nДоступні книги:");
        for (int i = 0; i < library.size(); i++) {
            System.out.println((i + 1) + ". " + library.get(i));
        }

        System.out.print("Введіть номер книги, яку хочете позичити: ");
        int bookIndex = getValidBookIndex(library.size());

        if (bookIndex != -1) {
            Book borrowed = library.remove(bookIndex);
            userBooks.add(borrowed);
            System.out.println("Ви позичили: " + borrowed);
        }
    }

    private static void ReturnBook() {
        if (userBooks.isEmpty()) {
            System.out.println("У вас немає книг для повернення.");
            return;
        }

        System.out.println("\nВаші позичені книги:");
        for (int i = 0; i < userBooks.size(); i++) {
            System.out.println((i + 1) + ". " + userBooks.get(i));
        }

        System.out.print("Введіть номер книги, яку хочете повернути: ");
        int returnIndex = getValidBookIndex(userBooks.size());

        if (returnIndex != -1) {
            Book returned = userBooks.remove(returnIndex);
            library.add(returned);
            System.out.println("Ви повернули: " + returned);
        }
    }

    private static int getValidBookIndex(int maxSize) {
        while (!scanner.hasNextInt()) {
            System.out.println("Невірний ввід. Введіть дійсний номер книги.");
            scanner.next();
        }
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Спожити залишок рядка

        if (index < 0 || index >= maxSize) {
            System.out.println("Невірний номер книги.");
            return -1;
        }
        return index;
    }

    private static void ExitApp() {
        System.out.println("Вихід...");
        scanner.close();
        System.exit(0);
    }
}