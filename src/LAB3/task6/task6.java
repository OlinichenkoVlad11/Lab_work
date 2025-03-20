package LAB3.task6;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Згенерований масив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Мінімальне число: " + min);
        System.out.println("Максимальне число: " + max);

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / size;
        System.out.println("Середнє значення: " + average);

        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);

        scanner.close();
    }
}

