package LAB8.task1;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Гетери для доступу до приватних змінних
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Підклас Employee, що додає поле salary
class Employee extends Person {
    private double salary;

    //  Конструктор з викликом super()
    public Employee(String name, int age, double salary) {
        super(name, age); // Виклик конструктора батьківського класу
        this.salary = salary;
    }

    // Геттер для salary
    public double getSalary() {
        return salary;
    }
}

class Main {
    public static void main(String[] args) {
        // Створення об'єкта Employee
        Employee employee = new Employee("Олександр Коваленко", 28, 30000.0);

        System.out.println("Ім'я працівника: " + employee.getName());
        System.out.println("Вік працівника: " + employee.getAge());
        System.out.println("Зарплата працівника: " + employee.getSalary());

    }
}
