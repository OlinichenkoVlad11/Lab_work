package LAB4.task4;

class Main {
    public static void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        printInfo("Аліса");
        printInfo("Іван", 25);
    }
}

