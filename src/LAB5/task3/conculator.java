package LAB5.task3;
import java.util.Scanner;

public class conculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;

        // Введення першого числа
        System.out.print("Введіть перше число: ");
        num1 = scanner.nextDouble();

        // Введення оператора
        System.out.print("Введіть оператор (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        // Введення другого числа
        System.out.print("Введіть друге число: ");
        num2 = scanner.nextDouble();

        // Виконання обчислень через switch
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Помилка: ділення на нуль!");
                    scanner.close();
                    return;
                }
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Помилка: некоректний оператор!");
                scanner.close();
                return;
        }

        System.out.println("Результат: " + result);

        // Закриття Scanner
        scanner.close();
    }
}

