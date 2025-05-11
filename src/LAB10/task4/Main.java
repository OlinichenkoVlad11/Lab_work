package LAB10.task4;

// Інтерфейс Readable
interface Readable {
    void read();
}

// Інтерфейс Writable
interface Writable {
    void write();
}

// Клас, що реалізує обидва інтерфейси
class FileDocument implements Readable, Writable {
    // Реалізація методу read() з інтерфейсу Readable
    @Override
    public void read() {
        System.out.println("Reading from file 📖");
    }

    // Реалізація методу write() з інтерфейсу Writable
    @Override
    public void write() {
        System.out.println("Writing to file ✍️");
    }

    // Додатковий метод класу
    public void close() {
        System.out.println("Closing file 🚪");
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта FileDocument
        FileDocument document = new FileDocument();

        // Виклик методів з обох інтерфейсів
        document.read();
        document.write();
        document.close();

        // Демонстрація поліморфізму через інтерфейси
        System.out.println("\nВикористання поліморфізму:");

        Readable reader = new FileDocument();
        reader.read();
        // reader.write(); // Помилка - цей метод не видно через Readable

        Writable writer = new FileDocument();
        writer.write();
        // writer.read(); // Помилка - цей метод не видно через Writable
    }
}
