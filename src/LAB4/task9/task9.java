package LAB4.task9;

class Main {
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Сума: " + sum(1, 2, 34,5,64,684));
        System.out.println("Сума: " + sum(10, 20, 30, 40));
        System.out.println("Сума: " + sum(5,95,534,45,245));
        System.out.println("Сума: " + sum());
    }
}
