//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.util.Scanner;
public class Area {
    double length;
    double breadth;

    // Constructor to initialize length and breadth
    Area(double len, double brd) {
        length = len;
        breadth = brd;
    }

    // Method to calculate and return the area
    double returnArea() {
        return length * breadth;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        // Create an object of the Area class
        Area rectangle = new Area(length, breadth);

        // Calculate and print the area
        double Area = rectangle.returnArea();
        System.out.println("Area of the rectangle: " + Area);

        scanner.close();
    }
}


    


    

