package LAB10.task2;

// Інтерфейс Flyable
interface Flyable {
    void fly();
}

// Абстрактний клас Bird
abstract class Bird {
    // Звичайний метод
    public void layEggs() {
        System.out.println("Laying eggs...");
    }

    // Абстрактний метод
    public abstract void makeSound();
}

// Клас Sparrow, який наслідує Bird та реалізує Flyable
class Sparrow extends Bird implements Flyable {
    // Реалізація абстрактного методу з Bird
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp!");
    }

    // Реалізація методу з інтерфейсу Flyable
    @Override
    public void fly() {
        System.out.println("Sparrow flying high!");
    }

    // Додатковий специфічний метод
    public void buildNest() {
        System.out.println("Building a nest...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта Sparrow
        Sparrow sparrow = new Sparrow();

        // Виклик методів з абстрактного класу Bird
        sparrow.layEggs();
        sparrow.makeSound();

        // Виклик методу з інтерфейсу Flyable
        sparrow.fly();

        // Виклик власного методу класу Sparrow
        sparrow.buildNest();

        // Демонстрація поліморфізму
        System.out.println("\nDemonstrating polymorphism:");
        Bird myBird = new Sparrow();
        myBird.makeSound();
        myBird.layEggs();

        Flyable flyingObject = new Sparrow();
        flyingObject.fly();
    }
}

