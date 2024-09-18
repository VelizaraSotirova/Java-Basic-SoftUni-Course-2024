package Lab;

import java.util.Scanner;

public class Fruit_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                switch (product) {
                    case "banana" -> price += 2.5 * quantity;
                    case "apple" -> price += 1.2 * quantity;
                    case "orange" -> price += 0.85 * quantity;
                    case "grapefruit" -> price += 1.45 * quantity;
                    case "kiwi" -> price += 2.7 * quantity;
                    case "pineapple" -> price += 5.5 * quantity;
                    case "grapes" -> price += 3.85 * quantity;
                    default -> System.out.println("error");
                }
            }
            case "Saturday", "Sunday" -> {
                switch (product) {
                    case "banana" -> price += 2.7 * quantity;
                    case "apple" -> price += 1.25 * quantity;
                    case "orange" -> price += 0.9 * quantity;
                    case "grapefruit" -> price += 1.6 * quantity;
                    case "kiwi" -> price += 3 * quantity;
                    case "pineapple" -> price += 5.6 * quantity;
                    case "grapes" -> price += 4.2 * quantity;
                    default -> System.out.println("error");
                }
            }
            default -> System.out.println("error");
        }

        if (price > 0) {
            System.out.printf("%.2f", price);
        }
    }
}
