package Lab;

import java.util.Scanner;

public class Trade_Commissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commission = 0;

        switch (town) {
            case "Sofia" -> {
                if (sales >= 0 && sales <= 500) {
                    commission += sales * 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commission += sales * 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    commission += sales * 0.08;
                } else if (sales > 10000) {
                    commission += sales * 0.12;
                } else {
                    System.out.println("error");
                }
            }
            case "Varna" -> {
                if (sales >= 0 && sales <= 500) {
                    commission += sales * 4.5 / 100;
                } else if (sales > 500 && sales <= 1000) {
                    commission += sales * 7.5 / 100;
                } else if (sales > 1000 && sales <= 10000) {
                    commission += sales * 0.1;
                } else if (sales > 10000) {
                    commission += sales * 0.13;
                } else {
                    System.out.println("error");
                }
            }
            case "Plovdiv" -> {
                if (sales >= 0 && sales <= 500) {
                    commission += sales * 5.5 / 100;
                } else if (sales > 500 && sales <= 1000) {
                    commission += sales * 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    commission += sales * 0.12;
                } else if (sales > 10000) {
                    commission += sales * 14.5 / 100;
                } else {
                    System.out.println("error");
                }
            }
            default -> System.out.println("error");
        }

        if (commission > 0) {
            System.out.printf("%.2f", commission);
        }
    }
}
