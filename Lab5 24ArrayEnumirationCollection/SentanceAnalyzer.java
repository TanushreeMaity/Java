/*WAP to enter any sentence and calculate the following:
  a) Total number of digits present in it.
  b) Total number of small letters and capital letters present in it.
  c) Total number of alphabets used in it.
  d) Total number of special character used in it.
  e) Total number of vowels presents in it.
  f) Total Number words present in that sentence.*/
import java.util.Scanner;
public class SentanceAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int digitCount = 0;
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int alphabetCount = 0;
        int specialCharCount = 0;
        int vowelCount = 0;
        int wordCount = 0;

        // Loop through each character in the sentence
        for (char c : sentence.toCharArray()) {
            if (Character.isDigit(c)) {
                // Count digits
                digitCount++;
            } else if (Character.isLowerCase(c)) {
                // Count lowercase letters
                lowercaseCount++;
                // Count alphabets (both lowercase and uppercase)
                alphabetCount++;
                if (isVowel(c)) {
                    // Count vowels
                    vowelCount++;
                }
            } else if (Character.isUpperCase(c)) {
                // Count uppercase letters
                uppercaseCount++;
                // Count alphabets (both lowercase and uppercase)
                alphabetCount++;
                if (isVowel(Character.toLowerCase(c))) {
                    // Count vowels (considering uppercase vowels as well)
                    vowelCount++;
                }
            } else if (Character.isWhitespace(c)) {
                // Count words by detecting spaces
                wordCount++;
            } else {
                // Count special characters
                specialCharCount++;
            }
        }

        // Adding 1 to wordCount to account for the last word without a space after it.
        wordCount++;

        // Display the results
        System.out.println("Total number of digits: " + digitCount);
        System.out.println("Total number of lowercase letters: " + lowercaseCount);
        System.out.println("Total number of uppercase letters: " + uppercaseCount);
        System.out.println("Total number of alphabets: " + alphabetCount);
        System.out.println("Total number of special characters: " + specialCharCount);
        System.out.println("Total number of vowels: " + vowelCount);
        System.out.println("Total number of words: " + wordCount);

        scanner.close();
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

        