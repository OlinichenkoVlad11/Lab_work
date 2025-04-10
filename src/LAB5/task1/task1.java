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

        double rate = annualRate / 100;
        double totalAmount = principal * Math.pow(1 + (rate / timesCompounded), timesCompounded * years);

        for (int i = 0; i < years * 12; i++) {
            totalAmount += monthlyDeposit * Math.pow(1 + (rate / timesCompounded), timesCompounded * ((years * 12 - i) / 12.0));
        }

        // 6. Виведення результату у форматі з двома знаками після коми
        System.out.printf("Через %d років ви отримаєте: $%.2f%n", years, totalAmount);

        // 7. Закриття Scanner
        scanner.close();
    }
}