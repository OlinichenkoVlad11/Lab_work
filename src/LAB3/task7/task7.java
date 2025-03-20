package LAB3.task7;

import java.util.Arrays;
import java.util.Random;

class SortingArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Несортований масив:");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Відсортований масив:");
        System.out.println(Arrays.toString(array));
    }
}

