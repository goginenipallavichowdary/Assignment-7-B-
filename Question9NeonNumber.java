import java.util.Scanner;

public class Question9NeonNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative integer: ");
        int number = input.nextInt();

        long square = (long) number * number;
        int digitSum = 0;

        // Take and add one digit of the square at a time.
        while (square > 0) {
            digitSum += square % 10;
            square /= 10;
        }

        if (number >= 0 && digitSum == number) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not a Neon number");
        }
    }
}