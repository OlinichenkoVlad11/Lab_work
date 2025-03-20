package LAB3.task8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class SearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Числа від 1 до 100
        }

        System.out.println("Згенерований масив: " + Arrays.toString(array));

        System.out.print("Введіть число для пошуку: ");
        int searchNumber = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + searchNumber + " знайдено у масиві.");
        } else {
            System.out.println("Число " + searchNumber + " не знайдено у масиві.");
        }
        scanner.close();
    }
}

