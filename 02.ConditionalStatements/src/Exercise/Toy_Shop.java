package Exercise;

import java.util.Scanner;

public class Toy_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scan.nextLine());
        int puzzlesCount = Integer.parseInt(scan.nextLine());
        int speakingDollsCount = Integer.parseInt(scan.nextLine());
        int teddyBearsCount = Integer.parseInt(scan.nextLine());
        int minionsCount = Integer.parseInt(scan.nextLine());
        int trucksCount = Integer.parseInt(scan.nextLine());

        double totalToysPrice = puzzlesCount * 2.60 + speakingDollsCount * 3 + teddyBearsCount * 4.10 + minionsCount * 8.20 + trucksCount * 2;

        int totalToysCount = puzzlesCount + speakingDollsCount + teddyBearsCount + minionsCount + trucksCount;

        if(totalToysCount >= 50) {
            double discount = totalToysPrice * 0.25;
            totalToysPrice = totalToysPrice - discount;
        }

        double shopRent = 0.1 * totalToysPrice;
        double difference = (totalToysPrice - shopRent) - holidayPrice;

        if (difference >= 0) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(difference));
        }
    }
}
