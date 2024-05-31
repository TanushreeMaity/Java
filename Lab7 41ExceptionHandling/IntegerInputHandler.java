//Write a Java program that asks the user to enter an integer. Handle the InputMismatchException that may occur if the user enters something that is not an integer.
import java.util.InputMismatchException;
import java.util.Scanner;
public class IntegerInputHandler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

    

