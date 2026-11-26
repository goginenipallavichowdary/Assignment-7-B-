import java.util.Scanner;

public class Question3AutomorphicNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int number = input.nextInt();

        long square = (long) number * number;

        // Compare the ending digits of the square with the input.
        boolean isAutomorphic = number >= 0
                && String.valueOf(square).endsWith(String.valueOf(number));

        if (isAutomorphic) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not an automorphic number");
        }
    }
}