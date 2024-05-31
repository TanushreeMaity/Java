//Write a Java program to copy all mappings from the specified map to another map.
import java.util.HashMap;
import java.util.Map;
public class CopyHashMap {
    public static void main(String[] args) {
        // Create the source HashMap
        Map<Integer, String> sourceMap = new HashMap<>();
        sourceMap.put(1, "One");
        sourceMap.put(2, "Two");
        sourceMap.put(3, "Three");

        // Create the destination HashMap
        Map<Integer, String> destinationMap = new HashMap<>();

        // Copy all mappings from the source map to the destination map
        destinationMap.putAll(sourceMap);

        // Display the destination map
        System.out.println("Destination Map:");
        for (Map.Entry<Integer, String> entry : destinationMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}


