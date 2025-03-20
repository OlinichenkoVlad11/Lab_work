package LAB3.task4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число N: ");
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Сума чисел від 1 до " + N + " дорівнює: " + sum);

        scanner.close();
    }
}

