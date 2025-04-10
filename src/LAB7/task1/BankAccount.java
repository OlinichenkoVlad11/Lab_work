package LAB7.task1;

class BankAccount {
    // Приватні поля
    private String accountNumber;
    private double balance;

    // Конструктор
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Гетер для отримання балансу
    public double getBalance() {
        return balance;
    }

    // Метод для поповнення рахунку
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Поповнення на: " + amount + " грн. Новий баланс: " + balance + " грн.");
        } else {
            System.out.println("Сума для поповнення повинна бути більше 0.");
        }
    }

    // Метод для зняття коштів
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Знято: " + amount + " грн. Новий баланс: " + balance + " грн.");
        } else {
            System.out.println("Недостатньо коштів або некоректна сума для зняття.");
        }
    }

    // Головний метод для тестування
    public static void main(String[] args) {
        BankAccount account = new BankAccount("UA1234567890", 1000.0);

        System.out.println("Початковий баланс: " + account.getBalance() + " грн.");

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0); // Недостатньо коштів
    }
}

