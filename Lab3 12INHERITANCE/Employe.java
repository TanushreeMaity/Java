//Create a class Employee with fields name and salary and a parameterized constructor to initialize them. Then, create a subclass Manager that inherits from Employee and has an additional field department. Write constructors for the Manager class that initialize its fields and invoke the constructor of the Employee class.
// Base class representing an Employee
public class Employe {
    private String name;   // The name of the employee
    private double salary; // The salary of the employee

    // Constructor to initialize the Employee
    public Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to get the name of the employee
    public String getName() {
        return name;
    }

    // Method to get the salary of the employee
    public double getSalary() {
        return salary;
    }
}

// Subclass Manager that extends Employee
class Manager extends Employe {
    private String department; // The department managed by the manager

    // Constructor to initialize the Manager
    public Manager(String name, double salary, String department) {
        super(name, salary); // Call the constructor of the base class (Employee)
        this.department = department; // Initialize the department of the manager
    }

    // Method to get the department managed by the manager
    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        // Create an Employee object and a Manager object
        Employe employe = new Employe("John Doe", 50000.0);
        Manager manager = new Manager("Jane Smith", 70000.0, "HR");

        // Print information about the Employee and Manager
        System.out.println("Employe: " + employe.getName() + ", Salary: $" + employe.getSalary());
        System.out.println("Manager: " + manager.getName() + ", Salary: $" + manager.getSalary() + ", Department: " + manager.getDepartment());
    }
}

