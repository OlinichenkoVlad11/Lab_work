package LAB12.task3;

import LAB12.task3.DescendantClasses.Book;
import LAB12.task3.DescendantClasses.DVD;
import LAB12.task3.DescendantClasses.Magazine;
import LAB12.task3.Interface.UserInterface;
import LAB12.task3.Users.User;
import LAB12.task3.list.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user = new User("Влад Олиниченко");

        library.addItem(new Book ("Java програмування", 2020, 30));
        library.addItem(new Book("Чистий код", 2008, 60));
        library.addItem(new Book("Убити пересмішника", 1960, 21));
        library.addItem(new Book("1984", 1949, 30));
        library.addItem(new Book("Мислення на Java", 2006, 45));


        library.addItem(new Magazine("Наука Щотижня", 2022, 15));

        library.addItem(new DVD("Початок", 2010, "Крістофер Нолан"));

        UserInterface ui = new UserInterface(library, user);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------- ");
            System.out.println("1. Список книг📚:");
            System.out.println("2. Позичити книжку📖");
            System.out.println("3. Повернути книгу🔄📖");
            System.out.println("4. Вихід🔚");
            System.out.println("👉Вибери операцію👈 ");
            System.out.println("---------------------------- ");
            int choice = sc.nextInt();
            sc.nextLine(); // очистити буфер
            ui.handleChoice(choice);
        }
    }
}

