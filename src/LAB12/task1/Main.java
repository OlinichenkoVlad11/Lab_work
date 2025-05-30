package LAB12.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
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
        return "\"" + title + "\" Від " + author + " (" + year + ")";
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> library = new ArrayList<>();
        List<Book> userBooks = new ArrayList<>();
        // Додаємо деякі книги до бібліотеки
        library.add(new Book("" + "Великий Гетсбі", "Ф. Скотт Фіцджеральд", 1925));
        library.add(new Book("Вбити переспішника", "Харпер Ліі", 1960));
        library.add(new Book("1984", "Джордж Орвел", 1949));
        library.add(new Book("Гордість і упередження", "Джейн Аустен", 1813));
        library.add(new Book("Хоббіт", "Толкін", 1937));


        while (true) {
            System.out.println("\nМеню диспетчера завдань:");
            System.out.println("1. Переглянути список книг");
            System.out.println("2. Позичити книгу ");
            System.out.println("3. Повернути книгу");
            System.out.println("4. Вийти з програми");
            System.out.print("Виберіть варіант: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //
            switch (choice) {
                case 1:
                    System.out.println("\n=== Книги  в бібліотеці ===");
                    if (library.isEmpty()) {
                        System.out.println("Такої книги немає в бібліотеці.");
                    } else {
                        for (int i = 0; i < library.size(); i++) {
                            System.out.println((i + 1) + ". " + library.get(i));
                        }
                    }

                    System.out.println("\n=== Твоя позичена книга ===");
                    if (userBooks.isEmpty()) {
                        System.out.println("Ти не позичав жодної книги.");
                    } else {
                        for (int i = 0; i < userBooks.size(); i++) {
                            System.out.println((i + 1) + ". " + userBooks.get(i));
                        }
                    }
                    break;
                case 2:
                    if (library.isEmpty()) {
                        System.out.println("Немає книг які можна взяти.");
                        break;
                    }

                    System.out.println("\nКниги в наявності:");
                    for (int i = 0; i < library.size(); i++) {
                        System.out.println((i + 1) + ". " + library.get(i));
                    }

                    System.out.print("Введіть номер книги яку хочеш взяти: ");
                    try {
                        int bookIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        if (bookIndex >= 0 && bookIndex < library.size()) {
                            Book borrowed = library.remove(bookIndex);
                            userBooks.add(borrowed);
                            System.out.println("Ти позичів: " + borrowed);
                        } else {
                            System.out.println("Недійсний номер книги!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Введи дійсний номер!");
                    }
                    break;

                case 3:
                    if (userBooks.isEmpty()) {
                        System.out.println("Ти не маєш книг для повернення.");
                        break;
                    }

                    System.out.println("\nТвої позичені книги:");
                    for (int i = 0; i < userBooks.size(); i++) {
                        System.out.println((i + 1) + ". " + userBooks.get(i));
                    }

                    System.out.print("Введіть номер книги, яку хочеш повернути: ");
                    try {
                        int returnIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        if (returnIndex >= 0 && returnIndex < userBooks.size()) {
                            Book returned = userBooks.remove(returnIndex);
                            library.add(returned);
                            System.out.println("Ти її повернув: " + returned);
                        } else {
                            System.out.println("Недійсний номер книги!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Будь-ласка введи дійсний номер!");
                    }
                    break;
                case 4:
                    System.out.println("Вихід...");
                    scanner.close();
                    return;
                default:    System.out.println("Недійсний варіант. Спробуй знову.");
            }
        }

    }
}









