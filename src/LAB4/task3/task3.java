package LAB4.task3;

class Main {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int result1 = multiply(4, 5);  // 4 * 5 = 20
        int result2 = multiply(7, 3);  // 7 * 3 = 21

        System.out.println("Добуток першої пари чисел: " + result1);
        System.out.println("Добуток другої пари чисел: " + result2);
    }
}
