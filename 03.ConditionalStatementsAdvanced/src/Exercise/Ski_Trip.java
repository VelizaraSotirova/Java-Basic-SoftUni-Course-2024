package Exercise;

import java.util.Scanner;

public class Ski_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String rating = scanner.nextLine();

        double price = 0;
        int nights = days - 1;

        switch (accommodation) {
            case "room for one person" -> {
                price = 18.00 * nights;
            }
            case "apartment" -> {
                price = 25.00 * nights;
                if(days > 15) {
                    price -= price * 0.5;
                } else if (days > 10) {
                    price -= price * 0.35;
                } else {
                    price -= price * 0.3;
                }
            }
            case "president apartment" -> {
                price = 35.00 * nights;
                if(days > 15) {
                    price -= price * 0.2;
                } else if (days > 10) {
                    price -= price * 0.15;
                } else {
                    price -= price * 0.1;
                }
            }
        }

        if("positive".equals(rating)) {
            price += price * 0.25;
        } else {
            price -= price * 0.1;
        }

        System.out.printf("%.2f", price);
    }
}
