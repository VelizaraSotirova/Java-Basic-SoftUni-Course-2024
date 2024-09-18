package Exercise;

import java.util.Scanner;

public class Fishing_Boat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring" -> price += 3000;
            case "Summer", "Autumn" -> price += 4200;
            case "Winter" -> price += 2600;
        }

        if (fishersCount <= 6) {
            price -= price * 0.1;
        } else if(fishersCount <= 11) {
            price -= price * 0.15;
        } else {
            price -= price * 0.25;
        }

        if (!season.equals("Autumn") && fishersCount % 2 == 0) {
            price -= price * 0.05;
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget-price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price-budget);
        }
    }
}
