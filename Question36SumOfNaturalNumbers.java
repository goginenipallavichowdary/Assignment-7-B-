import java.util.Scanner;

public class Question36SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int limit = input.nextInt();

        if (limit < 0) {
            System.out.println("Please enter zero or a positive integer.");
            return;
        }

        long sum = 0;

        // Add each natural number to the running total.
        for (long number = 1; number <= limit; number++) {
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}