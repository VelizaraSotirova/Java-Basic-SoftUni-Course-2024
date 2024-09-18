package Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        int coins = 0;

        // Преобразуваме сумата към стотинки, за да избегнем проблеми с точността при работа с числа с плаваща запетая
        int changeInCents = (int)Math.round(change * 100);

        while (changeInCents > 0) {
            if (changeInCents >= 200) {
                changeInCents -= 200;
            } else if (changeInCents >= 100) {
                changeInCents -= 100;
            } else if (changeInCents >= 50) {
                changeInCents -= 50;
            } else if (changeInCents >= 20) {
                changeInCents -= 20;
            } else if (changeInCents >= 10) {
                changeInCents -= 10;
            } else if (changeInCents >= 5) {
                changeInCents -= 5;
            } else if (changeInCents >= 2) {
                changeInCents -= 2;
            } else if (changeInCents >= 1) {
                changeInCents -= 1;
            }
            coins++;
        }

        System.out.println(coins);
    }
}
