package LAB10.task1;

// Абстрактний клас Animal
abstract class Animal {
    // Абстрактний метод (без реалізації)
    public abstract void makeSound();

    // Звичайний метод з реалізацією
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Підклас Dog
class Dog extends Animal {
    // Реалізація абстрактного методу
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Підклас Cat
class Cat extends Animal {
    // Реалізація абстрактного методу
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Виклик методів для собаки
        System.out.println("Dog:");
        dog.makeSound();
        dog.sleep();

        System.out.println(); // Пустий рядок для відокремлення

        // Виклик методів для кота
        System.out.println("Cat:");
        cat.makeSound();
        cat.sleep();
    }
}
