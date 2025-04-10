package LAB6.task2;

public class OOP {public static void main(String[] args) {
    // Створення об'єкта автомобіля
    Car myCar = new Car("Toyota", "Camry");

    // Вивід інформації про автомобіль
    myCar.printInfo();

    // Прискорення автомобіля
    myCar.accelerate(30);
    myCar.printInfo();

    myCar.accelerate(20);
    myCar.printInfo();
}
}

// Клас Car
class Car {
    // Поля класу
    private String brand;
    private String model;
    private int speed;

    // Конструктор
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    // Метод для прискорення
    public void accelerate(int increment) {
        this.speed += increment;
    }

    // Метод для виведення інформації
    public void printInfo() {
        System.out.println("Автомобіль: " + this.brand + " " + this.model);
        System.out.println("Поточна швидкість: " + this.speed + " км/год");
        System.out.println("--------------------------");
    }
}
