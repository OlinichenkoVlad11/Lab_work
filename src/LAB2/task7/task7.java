package LAB2.task7;

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть мінімальне значення: ");
        int min = scanner.nextInt();

        System.out.print("Введіть максимальне значення: ");
        int max = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        String parity = (randomNumber % 2 == 0) ? "парним" : "непарним";

        System.out.printf("Згенероване число: %d\n", randomNumber);
        System.out.printf("Число %d є %s.\n", randomNumber, parity);

        scanner.close();
    }
}

