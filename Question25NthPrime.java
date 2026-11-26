import java.util.Scanner;

public class Question25NthPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the prime position: ");
        int position = input.nextInt();

        if (position < 1) {
            System.out.println("Enter a positive position.");
            return;
        }

        int count = 0;
        long number = 1;

        // Count each prime until we reach the requested position.
        while (count < position) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }

        System.out.println("Prime at position " + position + ": " + number);
    }

    private static boolean isPrime(long number) {
        for (long divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return number >= 2;
    }
}