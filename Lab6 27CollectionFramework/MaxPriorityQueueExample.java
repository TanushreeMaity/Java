//Write a Java program to change priorityQueue to maximum priority queue.
import java.util.Comparator;
import java.util.PriorityQueue;
public class MaxPriorityQueueExample {
    public static void main(String[] args) {
        // Create a custom comparator to reverse the natural ordering
        Comparator<Integer> maxComparator = Comparator.reverseOrder();

        // Create a PriorityQueue using the custom comparator
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(maxComparator);

        // Add elements to the maximum priority queue
        maxPriorityQueue.add(5);
        maxPriorityQueue.add(2);
        maxPriorityQueue.add(9);
        maxPriorityQueue.add(1);
        maxPriorityQueue.add(7);

        // Poll elements from the maximum priority queue (highest priority first)
        while (!maxPriorityQueue.isEmpty()) {
            System.out.println(maxPriorityQueue.poll());
        }
    }
}

    

