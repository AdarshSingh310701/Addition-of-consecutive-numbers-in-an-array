import java.util.Scanner;

public class NumberAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array (between 3 and 20):");
        int size = sc.nextInt();

        if (size < 3 || size > 20) {
            System.out.println(size + " is an invalid size.");
            return; // Terminate the program
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Adding numbers:");

        for (int i = 0; i < size; i++) {
            int nextIndex = (i + 1) % size; // Calculate the index of the next number

            int sum = numbers[i] + numbers[nextIndex];

            System.out.print(sum + " ");
        }
    }
}
