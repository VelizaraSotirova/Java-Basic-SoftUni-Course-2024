package Exercise;

import java.util.Objects;
import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0;

        String destination ="";
        String holidayType = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (Objects.equals(season, "summer")) {
                price = 0.3 * budget;
                holidayType = "Camp";
            } else if ("winter".equals(season)) {
                price = 0.7 * budget;
                holidayType = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (Objects.equals(season, "summer")) {
                price = 0.4 * budget;
                holidayType = "Camp";
            } else if ("winter".equals(season)) {
                price = 0.8 * budget;
                holidayType = "Hotel";
            }
        } else {
            destination = "Europe";
            holidayType = "Hotel";
            price = 0.9 * budget;
        }

        System.out.printf("Somewhere in %s%n", destination);

        System.out.printf("%s - %.2f", holidayType, price);
    }
}
