import java.util.Scanner;

public class Question15BuzzNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // % 7 checks divisibility, and % 10 gives the last digit.
        if (number > 0 && (number % 7 == 0 || number % 10 == 7)) {
            System.out.println("Buzz number");
        } else {
            System.out.println("Not a Buzz number");
        }
    }
}