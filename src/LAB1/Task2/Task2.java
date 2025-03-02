package LAB1.Task2;

import java.util.Scanner;
class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть радіус: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Площа кола: " + area);
        scanner.close();
    }
}
