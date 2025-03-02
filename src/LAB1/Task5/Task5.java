package LAB1.Task5;

import java.util.Scanner;

class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть ваш вік: ");
        int age = scanner.nextInt();
        System.out.print("Введіть ваш зріст у метрах: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ви є студентом (так/ні)? ");
        String studentInput = scanner.nextLine();
        boolean isStudent = studentInput.equalsIgnoreCase("так");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " років");
        System.out.println("Height: " + height);
        System.out.println("Student: " + isStudent);
        scanner.close();
    }
}
