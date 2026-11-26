import java.util.Scanner;

public class Question31SmallestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        // Choose the smaller of the first two, then compare it with the third.
        int smaller = first <= second ? first : second;
        int smallest = smaller <= third ? smaller : third;

        System.out.println("Smallest: " + smallest);
    }
}