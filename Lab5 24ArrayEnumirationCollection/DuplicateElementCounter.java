//write array  program using input and calculate duplicates elements present in java array.
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class DuplicateElementCounter {
    
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

        // Create a HashMap to store element frequencies
        Map<Integer, Integer> elementFrequency = new HashMap<>();

        // Count duplicate elements
        for (int number : numbers) {
            if (elementFrequency.containsKey(number)) {
                // Increment the frequency count
                elementFrequency.put(number, elementFrequency.get(number) + 1);
            } else {
                // Add the element to the map with a frequency of 1
                elementFrequency.put(number, 1);
            }
        }

        // Display duplicate elements and their counts
        System.out.println("Duplicate elements and their counts:");
        for (Map.Entry<Integer, Integer> entry : elementFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }

        scanner.close();
    }
}

    

