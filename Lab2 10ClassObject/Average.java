//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
import java.util.Scanner;
public class Average {
    double num1;
    double num2;
    double num3;

    // Constructor to initialize the three numbers
    Average(double n1, double n2, double n3) {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    // Method to calculate and print the average
    void calculateAndPrintAverage() {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of the three numbers: " + average);
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Create an object of the Average class
        Average averageObject = new Average(num1, num2, num3);

        // Calculate and print the average
        averageObject.calculateAndPrintAverage();

        scanner.close();
    }
}

    

