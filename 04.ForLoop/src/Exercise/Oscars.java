package Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double pointsFromAcademy = scanner.nextDouble();
        int juryCount = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < juryCount; i++) {
            String juryName = scanner.nextLine();
            double pointsFromJury = scanner.nextDouble();
            scanner.nextLine();
            int nameLength = juryName.length();
            pointsFromAcademy += (nameLength * pointsFromJury) / 2;

            if (pointsFromAcademy > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, pointsFromAcademy);
                return;
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - pointsFromAcademy);
    }
}
