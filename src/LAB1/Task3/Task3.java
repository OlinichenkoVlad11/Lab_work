package LAB1.Task3;

import java.util.Scanner;

class ByteToDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число (byte): ");
        byte num = scanner.nextByte();

        double result = num * 2.5;
        int finalResult = (int) result;

        System.out.println("Результат: " + finalResult);

        scanner.close();
    }
}

