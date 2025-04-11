package LAB8.task3;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some sound");
    }
}

// Підклас Mammal, що успадковує Animal
class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public void walk() {
        System.out.println("Walking...");
    }
}

// Підклас Dog, що успадковує Mammal
class Dog extends Mammal {
    // Конструктор з використанням super()
    public Dog(String name) {
        super(name);
    }

    // Перевизначення методу makeSound()
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Рекс");

        // Виклик методів
        System.out.println("Ім'я собаки: " + myDog.name);
        myDog.makeSound(); // Виведе "Bark" (перевизначений метод)
        myDog.walk();      // Успадкований метод від Mammal

        // Демонстрація роботи super()
        Animal genericAnimal = new Animal("Тварина");
        genericAnimal.makeSound();
    }
}
