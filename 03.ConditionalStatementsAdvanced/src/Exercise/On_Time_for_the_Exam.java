package Exercise;

import java.util.Scanner;

public class On_Time_for_the_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examInMinutes = examHour * 60 + examMinute;
        int arrivalInMinutes = arrivalHour * 60 + arrivalMinute;

        if (examInMinutes - arrivalInMinutes > 30) {
            int hours = (arrivalInMinutes - examInMinutes) / 60;
            int minutes = (arrivalInMinutes - examInMinutes) % 60;

            System.out.println("Early");
            if (hours == 0) {
                System.out.printf("%d minutes before the start", Math.abs(minutes));
            } else {
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours before the start", Math.abs(hours), Math.abs(minutes));
                } else {
                    System.out.printf("%d:%d hours before the start", Math.abs(hours), Math.abs(minutes));
                }
            }
        } else if (examInMinutes - arrivalInMinutes < 0) {
            int hours = (examInMinutes - arrivalInMinutes) / 60;
            int minutes = Math.abs((examInMinutes - arrivalInMinutes) % 60);

            System.out.println("Late");
            if (hours == 0) {
                System.out.printf("%d minutes after the start", minutes);
            } else {
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours after the start", Math.abs(hours), Math.abs(minutes));
                } else {
                    System.out.printf("%d:%d hours after the start", Math.abs(hours), Math.abs(minutes));
                }
            }
        } else {
            int hours = (arrivalInMinutes - examInMinutes) / 60;
            int minutes = (arrivalInMinutes - examInMinutes) % 60;

            if(hours == 0 && minutes == 0) {
                System.out.println("On time");
            } else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", Math.abs(minutes));
            }
        }
    }
}
