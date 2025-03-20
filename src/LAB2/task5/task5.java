package LAB2.task5;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String inputString = scanner.nextLine();

        System.out.println("Довжина рядка: " + inputString.length());

        System.out.println("Перший символ: " + inputString.charAt(0));
        System.out.println("Останній символ: " + inputString.charAt(inputString.length() - 1));

        System.out.println("Верхній регістр: " + inputString.toUpperCase());
        System.out.println("Нижній регістр: " + inputString.toLowerCase());

        System.out.println("Підрядок: " + inputString.substring(0, 3));

        System.out.println("Чи містить слово \"Java\"? " + inputString.contains("Java"));

        scanner.close();
    }
}
