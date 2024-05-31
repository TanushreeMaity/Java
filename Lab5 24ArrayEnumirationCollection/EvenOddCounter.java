//Write a program that will take input from user in array and calculate count of even and odd numbers in given array.
import java.util.Scanner;
public class EvenOddCounter {
    
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

        // Initialize counters
        int evenCount = 0;
        int oddCount = 0;

        // Iterate through the array to count even and odd numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display the counts
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);

        scanner.close();
    }
}

    

