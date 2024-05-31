/*Write a program in Java to accept a word/a String and display the new string after removing all the vowels present in it.
Sample Input: COMPUTER PROGRAMMING
Sample Output: CMPTR PRGRAMMNG */
import java.util.Scanner;
public class RemoveVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove vowels and display the result
        String result = removeVowels(input);
        System.out.println("Result after removing vowels: " + result);

        scanner.close();
    }

    public static String removeVowels(String input) {
        // Use a regular expression to remove vowels (both uppercase and lowercase)
        return input.replaceAll("[AEIOUaeiou]", "");
    }
}

    

