package Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if(num >= 800) {
                p5++;
            } else if (num >= 600) {
                p4++;
            } else if (num >= 400) {
                p3++;
            } else if (num >= 200) {
                p2++;
            } else {
                p1++;
            }
        }

        double p1Percentage = ((double) p1 / n * 100.0);
        double p2Percentage = ((double) p2 / n * 100.0);
        double p3Percentage = ((double) p3 / n * 100.0);
        double p4Percentage = ((double) p4 / n * 100.0);
        double p5Percentage = ((double) p5 / n * 100.0);

        System.out.printf("%.2f%%\n", p1Percentage);
        System.out.printf("%.2f%%\n", p2Percentage);
        System.out.printf("%.2f%%\n", p3Percentage);
        System.out.printf("%.2f%%\n", p4Percentage);
        System.out.printf("%.2f%%\n", p5Percentage);
    }
}
