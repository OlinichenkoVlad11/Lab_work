package LAB8.task4;

class Shape {
    public double area() {
        return 0.0;
    }
}

//  Підклас Circle
class Circle extends Shape {
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Перевизначення методу area()
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

//  Підклас Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    // Конструктор
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Перевизначення методу area()
    @Override
    public double area() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Виведення площ фігур
        System.out.printf("Площа круга з радіусом %.1f: %.2f\n",
                circle.area(), circle.area());
        System.out.printf("Площа прямокутника %.1f x %.1f: %.2f\n",
                4.0, 6.0, rectangle.area());

        // Демонстрація поліморфізму
        Shape shape1 = new Circle(3.0);
        Shape shape2 = new Rectangle(2.0, 5.0);

        System.out.println("\nДемонстрація поліморфізму:");
        System.out.printf("Площа фігури 1: %.2f\n", shape1.area());
        System.out.printf("Площа фігури 2: %.2f\n", shape2.area());
    }
}
