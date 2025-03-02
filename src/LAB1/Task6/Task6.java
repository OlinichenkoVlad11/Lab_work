package LAB1.Task6;

import java.util.Scanner;

class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ширину прямокутника: ");
        double width = scanner.nextDouble();
        System.out.print("Введіть висоту прямокутника: ");
        double height = scanner.nextDouble();
        double area = width * height;
        System.out.println("Площа прямокутника: " + area);
        scanner.close();
    }
}
