package Exercise;

import java.util.Scanner;

public class Hotel_Room {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double price = 0;
        //String accomodation = "";

        switch (month) {
            case "May", "October" -> {
                if (days > 14) {
                    price = days * 65;
                    price -= price * 0.1;
                    System.out.printf("Apartment: %.2f lv.%n", price);
                    price = days * 50;
                    price -= price * 0.3;
                    System.out.printf("Studio: %.2f lv.", price);
                }else if (days > 7) {
                    System.out.printf("Apartment: %.2f lv.%n", 65.0 * days);
                    price = days * 50;
                    price -= price * 0.05;
                    System.out.printf("Studio: %.2f lv.", price);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n", 65.0 * days);
                    System.out.printf("Studio: %.2f lv.", 50.0 * days);
                }
            }

            case "June", "September" -> {
                if (days > 14) {
                    price = days * 68.7;
                    price -= price * 0.1;
                    System.out.printf("Apartment: %.2f lv.%n", price);
                    price = days * 75.2;
                    price -= price * 0.2;
                    System.out.printf("Studio: %.2f lv.", price);
                } else {
                    System.out.printf("Apartment: %.2f lv.%n", 68.7 * days);
                    System.out.printf("Studio: %.2f lv.", 75.2 * days);
                }
            }

            case "July", "August" -> {
                if (days > 14) {
                    price = days * 77;
                    price -= price * 0.1;
                    System.out.printf("Apartment: %.2f lv.%n", price);
                    System.out.printf("Studio: %.2f lv.", 76.0 * days);
                }  else {
                    System.out.printf("Apartment: %.2f lv.%n", 77.0 * days);
                    System.out.printf("Studio: %.2f lv.", 76.0 * days);
                }
            }
        }
    }
}
