//How to reverse a String in place in Java?
public class StringReversal {
        public static String reverseInPlace(String input) {
            // Convert the input string to a character array
            char[] charArray = input.toCharArray();
    
            // Initialize pointers for the start and end of the character array
            int start = 0;
            int end = charArray.length - 1;
    
            // Swap characters from the beginning and end until you reach the middle
            while (start < end) {
                // Swap charArray[start] and charArray[end]
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
    
                // Move the pointers towards each other
                start++;
                end--;
            }
    
            // Convert the character array back to a string
            return new String(charArray);
        }
    
        public static void main(String[] args) {
            String input = "Hello, World!";
            String reversed = reverseInPlace(input);
            System.out.println("Original String: " + input);
            System.out.println("Reversed String: " + reversed);
        }
    }
    

