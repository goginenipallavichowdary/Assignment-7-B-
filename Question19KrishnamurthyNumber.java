import java.util.Scanner;

public class Question19KrishnamurthyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // The array index is the digit, and the value is its factorial.
        int[] factorials = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        int remaining = number;
        int sum = 0;

        while (remaining > 0) {
            int digit = remaining % 10;
            sum += factorials[digit];
            remaining /= 10;
        }

        if (number > 0 && sum == number) {
            System.out.println("Krishnamurthy number");
        } else {
            System.out.println("Not a Krishnamurthy number");
        }
    }
}