package Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holidayPrice = Double.parseDouble(scanner.nextLine());
        double moneyAvailable = Double.parseDouble(scanner.nextLine());
        int spendingDays = 0;
        int days = 0;

        while (true) {
            String option = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            days++;
            if ("spend".equals(option)) {
                moneyAvailable -= money;
                spendingDays++;
                if (moneyAvailable < 0 ) {
                    moneyAvailable = 0;
                }
                if(spendingDays == 5) {
                    System.out.println("You can't save the money.");
                    System.out.printf("%d", spendingDays);
                    return;
                }
            }
            else {
                moneyAvailable += money;
                spendingDays = 0;

                if (holidayPrice <= moneyAvailable) {
                    break;
                }
            }
        }

        System.out.printf("You saved the money for %d days.", days);
    }
}
