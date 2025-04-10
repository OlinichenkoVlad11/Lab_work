package LAB6.task1;

public class Perosn {public static void main(String[] args) {
    // Створення об'єкта класу Person
    Person person = new Person();
    person.name = "Іван";
    person.age = 25;

    // Виклик методу introduce()
    person.introduce();
}
}

// Клас Person з полями name та age
class Person {
    String name;
    int age;

    // Метод introduce() для виведення інформації про особу
    public void introduce() {
        System.out.println("Привіт, мене звати " + name + ", мені " + age + " років.");
    }
}

