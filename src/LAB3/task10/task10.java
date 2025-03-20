package LAB3.task10;

import java.util.*;

class ManualArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Розмір масиву має бути більше нуля.");
            return;
        }

        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Введений масив: " + Arrays.toString(array));

        findDuplicates(array);

        scanner.close();
    }

    public static void findDuplicates(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!uniqueNumbers.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("Дублікатів немає.");
        } else {
            System.out.println("Знайдені дублікати: " + duplicates);
        }
    }
}

