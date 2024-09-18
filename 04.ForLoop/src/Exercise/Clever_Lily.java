package Exercise;

import java.util.Scanner;

public class Clever_Lily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        double washingMachinePrice = scanner.nextDouble();
        int toyPrice = scanner.nextInt();

        int totalToys = 0;
        double moneySaved = 0.0;
        int moneyReceived = 10; // Първата сума, която Лили получава на 2-рия си рожден ден

        for (int i = 1; i <= age; i ++) {
            if (i % 2 == 0) {
                // Четен рожден ден - Лили получава пари
                moneySaved += moneyReceived;
                moneyReceived += 10;
                moneySaved -= 1; // Братът взима 1 лев
            } else {
                // Нечетен рожден ден - Лили получава играчка
                totalToys++;
            }
        }

        moneySaved += totalToys * toyPrice;

        if (moneySaved >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", moneySaved - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - moneySaved);
        }
    }
}
