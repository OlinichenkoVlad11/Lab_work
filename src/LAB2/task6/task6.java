package LAB2.task6;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        double number = scanner.nextDouble();

        double sqrt = Math.sqrt(number);
        System.out.println("Квадратний корінь: " + String.format("%.2f", sqrt));

        long rounded = Math.round(number);
        System.out.println("Округлене значення: " + rounded);

        double squared = Math.pow(number, 2);
        System.out.println("Піднесене до квадрату: " + String.format("%.2f", squared));

        double sinValue = Math.sin(number);
        System.out.println("Синус числа: " + String.format("%.2f", sinValue));

        scanner.close();
    }
}

