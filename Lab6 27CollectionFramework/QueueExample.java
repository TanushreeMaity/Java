//Write a java program to add,retrive & remove element from Queue.
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Retrieve and print the element at the front of the Queue
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // Remove and print the element at the front of the Queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Retrieve and print the new front element of the Queue
        frontElement = queue.peek();
        System.out.println("New Front Element: " + frontElement);

        // Display the remaining elements in the Queue
        System.out.println("Remaining Elements in Queue:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}

    

