//Create a class Vehicle with fields make and model and a parameterized constructor to initialize them. Then, create a subclass Car that inherits from Vehicle and adds an additional field year and a constructor to initialize it.
import java.util.Scanner;

//Base class representing a Vehicle
class Vehicle {
    String make;  //The make of the vehicle
    String model; //The model of the vehicle

    //Constructor to initialize the Vehicle
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

//Subclass Car that extends Vehicle
class Car extends Vehicle {
    private int year; // The year of the car

    //Constructor to initialize the Car
    public Car(String make, String model, int year) {
        super(make, model); //Call the constructor of the base class (Vehicle)
        this.year = year;   //Initialize the year of the car
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the make of the car: ");
        String make = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year of the car: ");
        int year = scanner.nextInt();

        //Create a Car object using the provided input
        Car car = new Car(make, model, year);

        System.out.println("Car Details:");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);

        scanner.close();
    }
}

