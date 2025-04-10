package LAB6.task3;

public class Animal {public class AnimalDemo {
    public void main(String[] args) {
        // Створення масиву тварин
        animal[] animals = new animal[3];

        // Ініціалізація елементів масиву
        animals[0] = new animal("Собака", "Гав-гав");
        animals[1] = new animal("Кіт", "Мяу");
        animals[2] = new animal("Корова", "Му-у-у");

        // Виклик методу makeSound() для кожної тварини
        for (Animal.animal animal : animals) {
            animal.makeSound();
        }
    }
}

    // Клас Animal
    static class animal {
        private String name;
        private String sound;

        // Конструктор
        public animal(String name, String sound) {
            this.name = name;
            this.sound = sound;
        }

        // Метод для відтворення звуку тварини
        public void makeSound() {
            System.out.println(name + " видає звук: " + sound);
        }
    }
}
