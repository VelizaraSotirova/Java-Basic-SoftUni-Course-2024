package Exercise;

import java.util.Scanner;

public class Trekking_Mania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());
        int mussalaCount = 0;
        int monblanCount = 0;
        int kilimandjaroCount = 0;
        int k2Count = 0;
        int everestCount = 0;

        for(int i = 0; i < groupsCount; i++) {
            int peoplePerGroup = Integer.parseInt(scanner.nextLine());

            if (peoplePerGroup <= 5) {
                mussalaCount+=peoplePerGroup;
            } else if(peoplePerGroup <= 12) {
                monblanCount+=peoplePerGroup;
            } else if(peoplePerGroup <= 25) {
                kilimandjaroCount+=peoplePerGroup;
            } else if(peoplePerGroup <= 40) {
                k2Count+=peoplePerGroup;
            } else {
                everestCount+=peoplePerGroup;
            }
        }

        int totalPeople = mussalaCount + monblanCount + kilimandjaroCount + k2Count + everestCount;
        double mussala = (double) mussalaCount / totalPeople * 100;
        double monblan = (double) monblanCount / totalPeople * 100;
        double kilimandjaro = (double) kilimandjaroCount / totalPeople * 100;
        double k2 = (double) k2Count / totalPeople * 100;
        double everest = (double) everestCount / totalPeople * 100;

        System.out.printf("%.2f%%\n", mussala);
        System.out.printf("%.2f%%\n", monblan);
        System.out.printf("%.2f%%\n", kilimandjaro);
        System.out.printf("%.2f%%\n", k2);
        System.out.printf("%.2f%%\n", everest);
    }
}
