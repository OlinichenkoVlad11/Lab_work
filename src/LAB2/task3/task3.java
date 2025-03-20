package LAB2.task3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Максимальне число: " + max);

        scanner.close();
    }
}

