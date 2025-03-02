package LAB1.Task4;

import java.util.Scanner;

class CheckAdult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваш вік: ");
        int age = scanner.nextInt();

        boolean isAdult = age >= 18;
        System.out.println(isAdult);

        scanner.close();
    }
}
