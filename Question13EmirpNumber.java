import java.util.Scanner;

public class Question13EmirpNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int remaining = number;
        long reversed = 0;

        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }

        if (number != reversed && isPrime(number) && isPrime(reversed)) {
            System.out.println("Emirp number");
        } else {
            System.out.println("Not an Emirp number");
        }
    }

    private static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }

        // Stop once a factor pair would start repeating.
        for (long divisor = 2; divisor <= number / divisor; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}