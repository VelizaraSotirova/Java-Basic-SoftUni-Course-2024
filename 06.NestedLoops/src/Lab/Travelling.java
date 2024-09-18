package Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Прочитане на дестинацията
            String destination = scanner.nextLine();
            if (destination.equals("End")) {
                break; // При команда "End", излизаме от цикъла и приключваме програмата
            }

            // Прочитане на необходимия бюджет за дестинацията
            double budget = Double.parseDouble(scanner.nextLine());
            double savedMoney = 0;

            // Докато спестените пари не достигнат нужния бюджет, продължаваме да четем суми
            while (savedMoney < budget) {
                double money = Double.parseDouble(scanner.nextLine());
                savedMoney += money;
            }

            // Когато бюджетът е достигнат, изписваме съобщение и преминаваме към следващата дестинация
            System.out.printf("Going to %s!%n", destination);
        }
    }
}
