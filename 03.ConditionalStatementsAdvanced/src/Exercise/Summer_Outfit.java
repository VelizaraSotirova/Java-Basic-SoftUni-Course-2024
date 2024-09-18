package Exercise;

import java.util.Scanner;

public class Summer_Outfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String dayPart = scanner.nextLine();

        switch (dayPart) {
            case "Morning" -> {
                if (degrees >= 10 && degrees <= 18) {
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degrees);
                } else if (degrees > 18 && degrees <= 24) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else  if (degrees >= 25) {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                }
            }
            case "Afternoon" -> {
                if (degrees >= 10 && degrees <= 18) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (degrees > 18 && degrees <= 24) {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degrees);
                } else if (degrees >= 25) {
                    System.out.printf("It's %d degrees, get your Swimsuit and Barefoot.", degrees);
                }
            }
            case "Evening" -> {
                if (degrees >= 10 && degrees <= 18) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (degrees > 18 && degrees <= 24) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                } else if (degrees >= 25) {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degrees);
                }
            }
        }
    }
}
