package LAB7.task5;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Гетери
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Сетери з перевіркою
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            System.out.println("Невірне значення годин. Встановлено 0.");
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            System.out.println("Невірне значення хвилин. Встановлено 0.");
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            System.out.println("Невірне значення секунд. Встановлено 0.");
            this.seconds = 0;
        }
    }

    // Метод для виведення часу
    public void displayTime() {
        System.out.printf("Поточний час: %02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Метод для оновлення часу (тик)
    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59, 58);
        clock.displayTime();
        clock.tick();
        clock.displayTime();
        clock.tick();
        clock.displayTime();
    }
}

