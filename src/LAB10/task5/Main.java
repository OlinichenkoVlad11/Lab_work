package LAB10.task5;

// Інтерфейс Washable
interface Washable {
    void wash();
}

// Інтерфейс Dryable
interface Dryable {
    void dry();
}

// Абстрактний клас Appliance
abstract class Appliance {
    protected String brand;

    public Appliance(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();
}

// Клас WasherDryer, що наслідує Appliance та реалізує інтерфейси
class WasherDryer extends Appliance implements Washable, Dryable {
    public WasherDryer(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Пральна машина " + brand + " увімкнена");
    }

    @Override
    public void wash() {
        System.out.println("Прання запущено...");
    }

    @Override
    public void dry() {
        System.out.println("Сушіння запущено...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта WasherDryer
        WasherDryer myMachine = new WasherDryer("Samsung");

        // Виклик всіх методів
        System.out.println("Бренд: " + myMachine.getBrand());
        myMachine.turnOn();
        myMachine.wash();
        myMachine.dry();

        // Демонстрація поліморфізму
        System.out.println("\nДемонстрація поліморфізму:");

        // Використання як Appliance
        Appliance appliance = myMachine;
        System.out.println("Бренд (через Appliance): " + appliance.getBrand());
        appliance.turnOn();
        // appliance.wash(); // Помилка - метод не доступний через Appliance

        // Використання як Washable
        Washable washer = myMachine;
        washer.wash();
        // washer.turnOn(); // Помилка - метод не доступний через Washable

        // Використання як Dryable
        Dryable dryer = myMachine;
        dryer.dry();
        // dryer.turnOn(); // Помилка - метод не доступний через Dryable
    }
}
