package Exercise;

import java.util.Objects;
import java.util.Scanner;

public class Tennis_Ranklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentsCount = Integer.parseInt(scanner.nextLine());
        int startedPoints = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int wins = 0;

        for(int i = 0; i < tournamentsCount; i++) {
            String rank = scanner.nextLine();
            if (Objects.equals(rank, "W")) {
                points += 2000;
                wins++;
            } else if("F".equals(rank)) {
                points += 1200;
            } else if ("SF".equals((rank))) {
                points += 720;
            }
        }

        int totalPoints = points + startedPoints;
        int averagePoints = points / tournamentsCount;
        double winPercentage = ((double) wins /tournamentsCount) * 100;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%\n", winPercentage);
    }
}
