package LAB6.task5;

public class BookDemo {
    public static void main(String[] args) {
        // Створення об'єктів Book з використанням різних конструкторів
        Book book1 = new Book("1984", "Джордж Орвелл");
        Book book2 = new Book("Майстер і Маргарита");

        // Виведення інформації про книги
        System.out.println("Книга 1:");
        book1.displayInfo();

        System.out.println("\nКнига 2:");
        book2.displayInfo();
    }
}

// Клас Book
class Book {
    private String title;
    private String author;

    // Перший конструктор (з двома параметрами)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Другий конструктор (з одним параметром)
    public Book(String title) {
        this(title, "Невідомий"); // Виклик першого конструктора
    }

    // Метод для виведення інформації про книгу
    public void displayInfo() {
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
    }
}
