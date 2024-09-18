package Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramMemoryCount = Integer.parseInt(scanner.nextLine());

        double videocardsPrice = videocardsCount * 250;
        double processorsPrice = 0.35 * videocardsPrice * processorsCount;
        double ramMemoryPrice = 0.1 * videocardsPrice * ramMemoryCount;

        double totalPrice = videocardsPrice + processorsPrice + ramMemoryPrice;

        if (videocardsCount > processorsCount) {
            totalPrice -= totalPrice * 0.15;
        }

        if (totalPrice < budget) {
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
