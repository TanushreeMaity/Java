//Create a class Person with fields name and age and a parameterized constructor to initialize them. Then, create a subclass Employee that inherits from Person and has an additional field employeeId. Write constructors for the Employee class that initialize its fields and invoke the constructor of the Person class.
// Base class representing a Person
class Person {
    String name; // The name of the person
    int age;     // The age of the person

    // Constructor to initialize the Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to get the name of the person
    String getName() {
        return name;
    }

    // Method to get the age of the person
    int getAge() {
        return age;
    }
}

// Subclass Employee that extends Person
class Employeee extends Person {
    private int employeeId; // The ID of the employee

    // Constructor to initialize the Employee
    public Employeee(String name, int age, int employeeId) {
        super(name, age);   // Call the constructor of the base class (Person)
        this.employeeId = employeeId; // Initialize the employee ID
    }

    // Method to get the employee ID
    int getEmployeeId() {
        return employeeId;
    }

    public static void main(String[] args) {
        // Create a Person object and an Employee object
        Person person = new Person("John", 30);
        Employeee employeee = new Employeee("Alice", 25, 1001);

        // Print information about the Person and Employee
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
        System.out.println("Employeee: " + employeee.getName() + ", Age: " + employeee.getAge() + ", Employee ID: " + employeee.getEmployeeId());
    }
}

