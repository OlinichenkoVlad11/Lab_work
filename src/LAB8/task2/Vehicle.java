package LAB8.task2;

class Vehicle {
    protected int speed;

    // Метод для відображення швидкості
    public void showSpeed() {
        System.out.println("Поточна швидкість: " + speed + " км/год");
    }
}

//  Підклас Car, який успадковує Vehicle
class Car extends Vehicle {
    //  Метод для збільшення швидкості
    public void accelerate() {
        speed += 10;
        System.out.println("Швидкість збільшена на 10 км/год");
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Ініціалізація початкової швидкості
        myCar.speed = 50;

        // Краще використовувати методи для роботи зі швидкістю
        System.out.println("Початковий стан:");
        myCar.showSpeed();

        myCar.accelerate();
        myCar.showSpeed();

        myCar.accelerate();
        myCar.showSpeed();

    }
}