public class Question34EvenNumbers {
    public static void main(String[] args) {
        // Start at the first even number and add 2 each time.
        for (int number = 2; number <= 100; number += 2) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}