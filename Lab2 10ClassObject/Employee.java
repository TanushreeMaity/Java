//Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
/*Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat*/

public class Employee {
    String name;
    int yearOfJoining;
    String address;

    // Constructor to initialize employee details
    Employee(String n, int year, String addr) {
        name = n;
        yearOfJoining = year;
        address = addr;
    }

    // Method to display employee information
    void displayInfo() {
        System.out.println(name + "\t" + yearOfJoining + "\t\t" + address);
    }



    public static void main(String[] args) {
        // Create objects of the Employee class
        Employee emp1 = new Employee("Robert", 1994, "64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, "26B- WallsStreat");

        // Print employee information
        System.out.println("Name\t\tYear of joining\t\tAddress");
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}


    
    
    
        
    
    

