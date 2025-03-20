package LAB3.task5;

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

        scanner.close();
    }
}

