import java.util.Scanner;

public class Question5SunnyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        long next = (long) number + 1;
        long root = (long) Math.sqrt(next);

        // A perfect square is an integer root multiplied by itself.
        if (number > 0 && root * root == next) {
            System.out.println("Sunny number");
        } else {
            System.out.println("Not a Sunny number");
        }
    }
}