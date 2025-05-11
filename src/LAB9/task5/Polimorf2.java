package LAB9.task5;

// Базовий клас Notification
class Notification {
    public void send(String message) {
        System.out.println("Sending generic notification: " + message);
    }
}

// Підклас EmailNotification
class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}

// Підклас SMSNotification
class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Підклас PushNotification
class PushNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending push notification: " + message);
    }
}

class Pokimorf2 {
    public static void main(String[] args) {
        // Створення масиву різних типів сповіщень
        Notification[] notifications = new Notification[4];

        // Ініціалізація об'єктів різних типів
        notifications[0] = new EmailNotification();
        notifications[1] = new SMSNotification();
        notifications[2] = new PushNotification();
        notifications[3] = new EmailNotification(); // Ще один email

        // Відправка повідомлень через поліморфізм
        for (Notification notification : notifications) {
            notification.send("Hello, user!");
        }

        // Додатковий приклад - можна легко додати новий тип сповіщення
        System.out.println("\nAdding new notification type:");
        Notification newType = new Notification() {
            @Override
            public void send(String message) {
                System.out.println("Sending new type of notification: " + message);
            }
        };
        newType.send("Hello from new notification type!");
    }
}
