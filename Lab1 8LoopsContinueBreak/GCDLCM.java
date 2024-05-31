//Write a java program that will calculate GCD and LCM
import java.util.Scanner; 

public class GCDLCM {

	public static void main(String[] args) {

		    	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        scanner.close();

		        // Calculate GCD
		        int a = num1;
		        int b = num2;
		        while (b != 0) {
		            int temp = b;
		            b = a % b;
		            a = temp;
		        }
		        int gcd = a;

		        // Calculate LCM
		        int lcm = (num1 * num2) / gcd;

		        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
		        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
		    }
		}

    

