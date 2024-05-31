//Write a program to add elements to the HashMap given the key as integer and value data type is String?
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add elements to the HashMap
        hashMap.put(1, "Alice");
        hashMap.put(2, "Bob");
        hashMap.put(3, "Charlie");
        hashMap.put(4, "David");
        hashMap.put(5, "Eve");

        // Display the HashMap
        System.out.println("HashMap:");
        for (Integer key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println(key + " => " + value);
        }
    }
}

    

