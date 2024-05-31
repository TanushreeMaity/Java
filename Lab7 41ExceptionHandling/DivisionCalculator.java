//Write a Java program that divides two numbers entered by the user. Handle the ArithmeticException that may occur if the user attempts to divide by zero.
import java.util.Scanner;

public class DivisionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numerator, denominator;

        // Input numerator and denominator
        System.out.print("Enter the numerator: ");
        numerator = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        denominator = scanner.nextDouble();

        try {
            // Attempt to perform division
            double result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }

    public static double divideNumbers(double numerator, double denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}

    


