import java.util.Scanner;

public class Question30LargestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        // Start with the first value and replace it when we find a larger one.
        int largest = first;

        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }

        System.out.println("Largest: " + largest);
    }
}