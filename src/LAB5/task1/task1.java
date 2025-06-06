package LAB5.task1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal, monthlyDeposit, annualRate;
        int years, timesCompounded;

        System.out.print("Введіть початкову суму вкладу: ");
        principal = scanner.nextDouble();
        System.out.print("Введіть місячний платіж: ");
        monthlyDeposit = scanner.nextDouble();
        System.out.print("Введіть річну процентну ставку у відсотках: ");
        annualRate = scanner.nextDouble();
        System.out.print("Введіть кількість років вкладу: ");
        years = scanner.nextInt();
        System.out.print("Введіть кількість нарахувань відсотків на рік: ");
        timesCompounded = scanner.nextInt();

        double r = annualRate / 100;
        double amount = principal * Math.pow(1 + r / timesCompounded, timesCompounded * years);
        double monthlyRate = r / timesCompounded;
        double months = years * 12;
        double compoundedDeposits = monthlyDeposit * ((Math.pow(1 + r / timesCompounded, timesCompounded * years) - 1) / (r / timesCompounded));

        double totalAmount = amount + compoundedDeposits;

        System.out.printf("Через %d років ви отримаєте: $%.2f%n\n", years, amount);
        scanner.close();
    }
}