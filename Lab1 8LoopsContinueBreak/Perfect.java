//Write a java program to check given number is perfect number or not
public class Perfect {
         public static void main(String[] args) {
	        int number = 28;  // Change this to the number you want to check
	        
	        int sum = 1;  // Initialize the sum of divisors with 1

	        // Find divisors and add them to the sum
	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                sum += i;
	                if (i != number / i) {
	                    sum += number / i;
	                }
	            }
	        }

	        // Check if the sum of divisors is equal to the number itself
	        if (sum == number && number > 1) {
	            System.out.println(number + " is a perfect number.");
	        } else {
	            System.out.println(number + " is not a perfect number.");
	        }
	    }
	}

    

