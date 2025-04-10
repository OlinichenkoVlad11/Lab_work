package LAB6.task4;

public class Counter {public static void main(String[] args) {
    // Робота зі звичайним класом Counter
    System.out.println("Робота зі звичайним класом Counter:");
    counter counter1 = new counter();
    counter counter2 = new counter();

    counter1.increment();
    counter1.increment();
    counter2.increment();

    System.out.println("counter1: " + counter1.getCount()); // 2
    System.out.println("counter2: " + counter2.getCount()); // 1
    System.out.println("Кожен об'єкт має свій власний лічильник");

    // Робота зі статичним класом StaticCounter
    System.out.println("\nРобота зі статичним класом StaticCounter:");
    StaticCounter.increment();
    StaticCounter.increment();
    StaticCounter.increment();

    System.out.println("StaticCounter: " + StaticCounter.getCount()); // 3
    System.out.println("Статичний лічильник є спільним для всієї програми");

    // Демонстрація спільного використання статичного лічильника
    System.out.println("\nЩе один виклик StaticCounter.increment():");
    StaticCounter.increment();
    System.out.println("StaticCounter: " + StaticCounter.getCount()); // 4
}
}

// Звичайний клас Counter
class counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Статичний клас StaticCounter
class StaticCounter {
    private static int count = 0;

    public static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

