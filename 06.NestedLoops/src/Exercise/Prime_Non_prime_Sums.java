package Exercise;

import java.util.Scanner;

public class Prime_Non_prime_Sums {

        // Метод за проверка дали числото е просто
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            if (number <= 3) {
                return true;
            }
            if (number % 2 == 0 || number % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= number; i += 6) {
                if (number % i == 0 || number % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sumPrimes = 0;
            int sumNonPrimes = 0;

            while (true) {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("stop")) {
                    break;
                }

                try {
                    int number = Integer.parseInt(input);
                    if (number < 0) {
                        System.out.println("Number is negative.");
                    } else if (isPrime(number)) {
                        sumPrimes += number;
                    } else {
                        sumNonPrimes += number;
                    }
                } catch (NumberFormatException e) {
                    // Игнориране на невалиден вход
                    continue;
                }
            }

            System.out.println("Sum of all prime numbers is: " + sumPrimes);
            System.out.println("Sum of all non prime numbers is: " + sumNonPrimes);
        }
    }

