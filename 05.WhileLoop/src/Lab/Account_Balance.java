package Lab;

import java.util.Scanner;

public class Account_Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;

        String input = scanner.nextLine();
        while(!input.equals("NoMoreMoney")) {
            double amount = Double.parseDouble(input);
            if(amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", amount);
            balance += amount;

            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", balance);
    }
}
