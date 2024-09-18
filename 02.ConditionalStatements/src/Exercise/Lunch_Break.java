package Exercise;

import java.util.Scanner;

public class Lunch_Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seriesDuration = Integer.parseInt(scanner.nextLine());
        int lunchBreakDuration = Integer.parseInt(scanner.nextLine());

        double lunchTime = (double)lunchBreakDuration / 8;
        double restTime = (double)lunchBreakDuration / 4;
        int timeLeft = (int)(lunchBreakDuration - lunchTime - restTime);

        if (timeLeft >= seriesDuration) {
            System.out.printf("You have enough time to watch %s and left with %d minutes free time.", seriesName, timeLeft - seriesDuration);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", seriesName, seriesDuration - timeLeft);
        }

    }
}
