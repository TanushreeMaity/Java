//Calculate sum of array elements .
import java.util.Scanner;

public class ArraySumCalculator {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Input elements into the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of array elements: " + sum);

        scanner.close();
    }
}

    

