import java.util.Scanner;

public class Question33PerfectSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Not a perfect square");
            return;
        }

        long root = (long) Math.sqrt(number);

        // Square the whole-number part of the root and check the result.
        if (root * root == number) {
            System.out.println("Perfect square");
        } else {
            System.out.println("Not a perfect square");
        }
    }
}