package LAB9.task2;

class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Anim {
    public static void main(String[] args) {
        // Створення масиву об'єктів Animal
        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Cat();

        // Виклик методу makeSound() для кожного елемента масиву
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
