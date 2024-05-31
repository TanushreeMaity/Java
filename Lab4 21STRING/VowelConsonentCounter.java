//How do you count a number of vowels and consonants in a given string? 
public class VowelConsonentCounter {
        public static void main(String[] args) {
            String input = "Hello, World!";
            input = input.toLowerCase(); // Convert the input to lowercase for case-insensitive counting
    
            int vowelCount = 0;
            int consonantCount = 0;
    
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
    
                if (ch >= 'a' && ch <= 'z') {
                    // Check if the character is a vowel
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }
    
            System.out.println("Input String: " + input);
            System.out.println("Number of Vowels: " + vowelCount);
            System.out.println("Number of Consonants: " + consonantCount);
        }
    }
    
    

