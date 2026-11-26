import java.util.Scanner;

public class Question26AlternatePrimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = input.nextInt();

        int primePosition = 0;

        for (long number = 2; number <= limit; number++) {
            if (isPrime(number)) {
                primePosition++;

                // Print the 1st, 3rd, 5th, and later odd-positioned primes.
                if (primePosition % 2 != 0) {
                    System.out.print(number + " ");
                }
            }
        }
        System.out.println();
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
