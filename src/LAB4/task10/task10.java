package LAB4.task10;

class Main {
    public static void printNumbers(String message, int... numbers) {
        System.out.println(message);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers("Числа 1:", 1, 2, 3, 4);    // Повідомлення + 4 числа
        printNumbers("Числа 2:", 10, 20);        // Повідомлення + 2 числа
        printNumbers("Число 3:", 7);             // Повідомлення + 1 число
        printNumbers("Числа 4:", 100, 200, 300); // Повідомлення + 3 числа
    }
}

