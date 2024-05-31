//Write a program to print prime number  series
public class Prime {
	public static void main(String[] args) {
	
		        int n = 50;  // Number of prime numbers to print
		        int count = 0;  // Count of prime numbers found
		        int num = 2;  // Start with the first prime number

		        System.out.println("Prime number series:");

		        while (count < n) {
		            boolean isPrime = true;

		            // Check if the current number is prime
		            for (int i = 2; i * i <= num; i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }

		            if (isPrime) {
		                System.out.print(num + " ");
		                count++;
		            }
		            num++;
		        }
		    }
		}

    

