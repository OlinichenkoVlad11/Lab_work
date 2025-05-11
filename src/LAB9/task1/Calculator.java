package LAB9.task1;

public class Calculator {
    // Метод для додавання двох цілих чисел
    public int add(int a, int b) {
        return a + b;
    }
    // Перевантажений метод для додавання двох чисел з плаваючою крапкою
    public double add(double a, double b) {
        return a + b;
    }
    // Перевантажений метод для додавання трьох цілих чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Виклик різних версій методу add()
        System.out.println("Додавання двох цілих: " + calc.add(5, 3));
        System.out.println("Додавання двох дробових: " + calc.add(2.5, 3.7));
        System.out.println("Додавання трьох цілих: " + calc.add(1, 2, 3));
    }
}
