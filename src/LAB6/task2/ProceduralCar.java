package LAB6.task2;

public class ProceduralCar {public static void main(String[] args) {
    // Змінні для зберігання даних про автомобіль
    String carBrand = "Toyota";
    String carModel = "Camry";
    int carSpeed = 0;

    // Вивід інформації про автомобіль
    printCarInfo(carBrand, carModel, carSpeed);

    // Прискорення автомобіля
    carSpeed = accelerate(carSpeed, 30);
    printCarInfo(carBrand, carModel, carSpeed);

    carSpeed = accelerate(carSpeed, 20);
    printCarInfo(carBrand, carModel, carSpeed);
}

    // Функція для прискорення
    public static int accelerate(int currentSpeed, int increment) {
        return currentSpeed + increment;
    }

    // Функція для виведення інформації
    public static void printCarInfo(String brand, String model, int speed) {
        System.out.println("Автомобіль: " + brand + " " + model);
        System.out.println("Поточна швидкість: " + speed + " км/год");
        System.out.println("--------------------------");
    }
}

