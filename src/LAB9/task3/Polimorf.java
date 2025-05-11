package LAB9.task3;


abstract class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }

    public abstract void displayType();
}

// Підклас Circle (наслідування)
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle ⚪");
    }

    @Override
    public void displayType() {
        System.out.println("This is a circle");
    }
}

// Підклас Square (наслідування)
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing square ◼");
    }

    @Override
    public void displayType() {
        System.out.println("This is a square");
    }
}

// Підклас Triangle (наслідування)
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing triangle ▲");
    }

    @Override
    public void displayType() {
        System.out.println("This is a triangle");
    }
}

public class Polimorf {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();
        shapes[3] = new Circle(); // Ще одне коло

        // Виклик методів для кожного об'єкта (динамічний поліморфізм)
        for (Shape shape : shapes) {
            shape.draw();
            shape.displayType();
            System.out.println();
        }
    }
}
