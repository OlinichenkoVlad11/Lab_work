package LAB3.task3;

class Main {
    public static void main(String[] args) {

        System.out.println("Таблиця множення для числа 7 (цикл for):");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 * " + i + " = " + (7 * i));
        }


        System.out.println("\nТаблиця множення для числа 7 (цикл while):");
        int j = 1;
        while (j <= 10) {
            System.out.println("7 * " + j + " = " + (7 * j));
            j++;
        }


        System.out.println("\nТаблиця множення для числа 7 (цикл do-while):");
        int k = 1;
        do {
            System.out.println("7 * " + k + " = " + (7 * k));
            k++;
        } while (k <= 10);
    }
}

