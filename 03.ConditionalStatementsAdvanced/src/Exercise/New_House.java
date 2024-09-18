package Exercise;

import java.util.Scanner;

public class New_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowersCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if ("Roses".equals(flowersType)) {
            price += flowersCount * 5;
            if (flowersCount > 80) {
                price -= price * 0.1;
            }
        } else if ("Dahlias".equals(flowersType)) {
            price += flowersCount * 3.8;
            if (flowersCount > 90) {
                price -= price * 0.15;
            }
        } else if ("Tulips".equals(flowersType)) {
            price += flowersCount * 2.8;
            if (flowersCount > 80) {
                price -= price * 0.15;
            }
        } else if ("Narcissus".equals(flowersType)) {
            price += flowersCount * 3;
            if (flowersCount < 120) {
                price += price * 0.15;
            }
        } else if ("Gladiolus".equals(flowersType)) {
            price += flowersCount * 2.5;
            if (flowersCount < 80) {
                price += price * 0.2;
            }
        }

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowersType, budget-price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price-budget);
        }
    }
}
