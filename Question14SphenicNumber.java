import java.util.Scanner;

public class Question14SphenicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int remaining = input.nextInt();

        int factorCount = 0;

        for (int factor = 2; factor <= remaining / factor; factor++) {
            if (remaining % factor == 0) {
                remaining /= factor;
                factorCount++;

                // If the same factor divides again, it is repeated.
                if (remaining % factor == 0) {
                    System.out.println("Not a Sphenic number");
                    return;
                }
            }
        }

        if (remaining > 1) {
            factorCount++; // Any leftover factor is prime.
        }

        if (factorCount == 3) {
            System.out.println("Sphenic number");
        } else {
            System.out.println("Not a Sphenic number");
        }
    }
}