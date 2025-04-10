package LAB7.task3;

public class Car {
    private String brand;
    private String model;
    private int speed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    // Гетери
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    // Метод прискорення
    public void speedcar(int value) {
        if (value > 0) {
            speed += value;
            System.out.println("Прискорення на " + value + " км/год. Поточна швидкість: " + speed + " км/год.");
        } else {
            System.out.println("Значення для прискорення повинно бути більше 0.");
        }
    }

    // Метод гальмування
    public void brakecar(int value) {
        if (value > 0) {
            speed -= value;
            if (speed < 0) {
                speed = 0;
            }
            System.out.println("Гальмування на " + value + " км/год. Поточна швидкість: " + speed + " км/год.");
        } else {
            System.out.println("Значення для гальмування повинно бути більше 0.");
        }
    }

    // Метод для виведення інформації про авто
    public void displayInfo() {
        System.out.println("Автомобіль: " + brand + " " + model);
        System.out.println("Поточна швидкість: " + speed + " км/год.");
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        Car car = new Car("Chery", "Amulet");
        car.displayInfo();

        car.speedcar(50);
        car.speedcar(30);
        car.brakecar(60);
        car.brakecar(30);
    }
}


