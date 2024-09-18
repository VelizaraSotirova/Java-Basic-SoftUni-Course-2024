package Lab;

import java.util.Objects;
import java.util.Scanner;

public class Small_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        if(Objects.equals(town, "Sofia")) {
            switch (product) {
                case "coffee" -> price += 0.5 * quantity;
                case "water" -> price += 0.8 * quantity;
                case "beer" -> price += 1.2 * quantity;
                case "sweets" -> price += 1.45 * quantity;
                case "peanuts" -> price += 1.6 * quantity;
            }
        } else if(Objects.equals(town, "Plovdiv")) {
            switch (product) {
                case "coffee" -> price += 0.4 * quantity;
                case "water" -> price += 0.7 * quantity;
                case "beer" -> price += 1.15 * quantity;
                case "sweets" -> price += 1.3 * quantity;
                case "peanuts" -> price += 1.5 * quantity;
            }
        } else if(Objects.equals(town, "Varna")) {
            switch (product) {
                case "coffee" -> price += 0.45 * quantity;
                case "water" -> price += 0.7 * quantity;
                case "beer" -> price += 1.1 * quantity;
                case "sweets" -> price += 1.35 * quantity;
                case "peanuts" -> price += 1.55 * quantity;
            }
        }

        String strPrice = String.valueOf(price).trim();
        System.out.println(strPrice);
    }
}
