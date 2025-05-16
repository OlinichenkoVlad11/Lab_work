package LAB10.task3;

// Інтерфейс Playable
interface Playable {
    void play();
}

// Клас Guitar, що реалізує інтерфейс Playable
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing guitar 🎸");
    }
}

// Клас Piano, що реалізує інтерфейс Playable
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing piano 🎹");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        // Створення масиву інструментів типу Playable
        Playable[] instruments = new Playable[3];

        // Заповнення масиву різними інструментами
        instruments[0] = new Guitar();
        instruments[1] = new Piano();
        instruments[2] = new Guitar(); // Ще одна гітара

        // Виклик методу play() для кожного інструменту
        for (Playable instrument : instruments) {
            instrument.play();
        }

        // Додатковий приклад - можна легко додати новий інструмент
        System.out.println("\nAdding new instrument:");
        Playable drums = new Playable() {
            @Override
            public void play() {
                System.out.println("Playing drums 🥁");
            }
        };
        drums.play();
    }
}
