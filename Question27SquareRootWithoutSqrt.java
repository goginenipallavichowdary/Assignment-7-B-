import java.util.Scanner;

public class Question27SquareRootWithoutSqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative number: ");
        double number = input.nextDouble();

        if (number < 0 || !Double.isFinite(number)) {
            System.out.println("Please enter a finite, nonnegative number.");
            return;
        }

        if (number == 0) {
            System.out.println("Square root: 0.0");
            return;
        }

        double low = 0;
        double high = Math.max(1, number);

        // Repeatedly cut the search range in half.
        for (int step = 0; step < 1100; step++) {
            double middle = low + (high - low) / 2;

            if (middle == low || middle == high) {
                break; // The computer cannot represent a closer midpoint.
            }

            // This checks whether middle squared is too high without multiplying.
            if (middle > number / middle) {
                high = middle;
            } else {
                low = middle;
            }
        }

        System.out.println("Approximate square root: " + low);
    }
}