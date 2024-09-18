package Exercise;

import java.util.Scanner;

public class Godzilla_vs_Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int statistsCount = Integer.parseInt(scanner.nextLine());
        double clothingPricePerStatist = Double.parseDouble(scanner.nextLine());

        double clothingPrice = statistsCount * clothingPricePerStatist;
        double decorPrice = filmBudget * 0.1;
        if (statistsCount > 150) {
            clothingPrice -= clothingPrice * 0.1;
        }

        double expense = clothingPrice + decorPrice;
        if(expense <= filmBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", filmBudget-expense);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", expense-filmBudget);
        }
    }
}
