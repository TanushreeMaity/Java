//Write a program to print palindrome number.
public class Palindrome {
	public static void main(String[] args) {
		
		        int n = 1000;  // Number of palindrome numbers to print
		        int count = 0;  // Count of palindrome numbers found
		        int num = 1;  // Start with the first number

		        System.out.println("Palindrome numbers:");

		        while (count < n) {
		            int originalNum = num;
		            int reversedNum = 0;
		            int temp = num;

		            // Reverse the digits of the number
		            while (temp > 0) {
		                int digit = temp % 10;
		                reversedNum = reversedNum * 10 + digit;
		                temp /= 10;
		            }

		            // Check if the reversed number is equal to the original number
		            if (originalNum == reversedNum) {
		                System.out.print(originalNum + " ");
		                count++;
		            }
		            num++;
		        }
		    }
		}

    

