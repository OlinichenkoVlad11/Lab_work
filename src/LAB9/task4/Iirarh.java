package LAB9.task4;

// Базовий клас Shape
class Shape {
    // Метод area() повертає 0.0 для базового класу
    public double area() {
        return 0.0;
    }
}

// Підклас Circle
class Circle extends Shape {
    private double radius;

    // Конструктор класу Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Перевизначений метод area()
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Підклас Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    // Конструктор класу Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Перевизначений метод area()
    @Override
    public double area() {
        return width * height;
    }
}

public class Iirarh {
    public static void main(String[] args) {
        // Створення масиву об'єктів Shape
        Shape[] shapes = new Shape[4];

        // Заповнення масиву об'єктами Circle і Rectangle
        shapes[0] = new Circle(5.0);          // Радіус 5.0
        shapes[1] = new Rectangle(4.0, 6.0); // Ширина 4.0, висота 6.0
        shapes[2] = new Circle(3.0);          // Радіус 3.0
        shapes[3] = new Rectangle(2.0, 8.0); // Ширина 2.0, висота 8.0

        // Виклик методу area() для кожного об'єкта
        for (Shape shape : shapes) {
            System.out.printf("Area: %.2f%n", shape.area());
        }
    }
}
