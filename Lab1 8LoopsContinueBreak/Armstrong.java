//Write a java Program to print  Armstrongs number.
public class Armstrong {

        public static void main(String[] args) {
    
                    // Declare and initialize variables
                    int number = 371;           // The number to check
                    int originalNumber;         // Store the original number
                    int remainder;              // Store the remainder of each digit
                    int result = 0;             // Store the sum of digits raised to the power
    
                    originalNumber = number;    // Save the original number for comparison later
    
                    // Calculate the sum of cubes of digits
                    while (originalNumber != 0) {
                        remainder = originalNumber % 10;         // Extract the last digit
                        result += Math.pow(remainder, 3);        // Cube the digit and add to the result
                        originalNumber /= 10;                    // Remove the last digit
                    }
    
                    // Check if the number is an Armstrong number
                    if (result == number) {
                        System.out.println(number + " is an Armstrong number.");
                    } else {
                        System.out.println(number + " is not an Armstrong number.");
                    }
        }
    }
    

