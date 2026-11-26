import java.util.Scanner;

public class Question4PetersonNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        int remaining = number;
        int sum = 0;

        while (remaining > 0) {
            int digit = remaining % 10;
            int factorial = 1; // Starting at 1 also handles 0!.

            for (int factor = 2; factor <= digit; factor++) {
                factorial *= factor;
            }

            sum += factorial;
            remaining /= 10;
        }

        if (number > 0 && sum == number) {
            System.out.println("Peterson number");
        } else {
            System.out.println("Not a Peterson number");
        }
    }
}