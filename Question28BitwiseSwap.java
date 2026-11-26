import java.util.Scanner;

public class Question28BitwiseSwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int first = input.nextInt();
        System.out.print("Enter the second integer: ");
        int second = input.nextInt();

        System.out.println("Before: " + first + ", " + second);

        first = first ^ second;  // Combine the bits.
        second = first ^ second; // Recover the original first value.
        first = first ^ second;  // Recover the original second value.

        System.out.println("After: " + first + ", " + second);
    }
}