import java.util.Scanner;

public class Question29GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        long first = Math.abs((long) input.nextInt());
        System.out.print("Enter the second integer: ");
        long second = Math.abs((long) input.nextInt());

        if (first == 0 && second == 0) {
            System.out.println("The GCD of 0 and 0 is undefined.");
            return;
        }

        // Replace the pair with the second number and the remainder.
        while (second != 0) {
            long remainder = first % second;
            first = second;
            second = remainder;
        }

        System.out.println("GCD: " + first);
    }
}