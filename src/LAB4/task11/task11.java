package LAB4.task11;

class Main {
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Масив не може бути порожнім");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Максимум 1: " + findMax(3, 5, 7, 2, 8));
        System.out.println("Максимум 2: " + findMax(10, 20, 30));
        System.out.println("Максимум 3: " + findMax(100,20,35));
        System.out.println("Максимум 4: " + findMax(50, 40, 60, 70));
    }
}

