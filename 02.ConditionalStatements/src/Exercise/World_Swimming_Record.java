package Exercise;

import java.util.Scanner;

public class World_Swimming_Record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = scanner.nextDouble();
        double secondsPerMeter = scanner.nextDouble();

        double secondsToSwim = distanceInMeters * secondsPerMeter;
        int meters = (int) (distanceInMeters / 15);
        double addedSeconds = meters * 12.5;
        double totalTime = secondsToSwim + addedSeconds;

        double difference = totalTime - worldRecord;

        if(difference > 0) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(difference));
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }

    }
}
