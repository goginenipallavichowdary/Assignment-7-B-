import java.util.Scanner;

public class Question10SpyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int remaining = number;
        int sum = 0;
        long product = 1;

        // Use the same digit for both calculations.
        while (remaining > 0) {
            int digit = remaining % 10;
            sum += digit;
            product *= digit;
            remaining /= 10;
        }

        if (number > 0 && sum == product) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a Spy number");
        }
    }
}