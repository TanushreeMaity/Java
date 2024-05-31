//Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.
public class Student1 {
        String name;
        int roll_no;
        String phoneNumber;
        String address;
        
        public static void main(String[] args) {
            // Create objects of the Student class
            Student1 sam = new Student1();
            Student1 john = new Student1();
            
            // Assign values to Sam's details
            sam.name = "Sam";
            sam.roll_no = 1;
            sam.phoneNumber = "1234567890";
            sam.address = "123 Main St, City";
            
            // Assign values to John's details
            john.name = "John";
            john.roll_no = 2;
            john.phoneNumber = "9876543210";
            john.address = "456 Elm St, Town";
            
            // Print Sam's details
            System.out.println("Details of Sam:");
            System.out.println("Name: " + sam.name);
            System.out.println("Roll No: " + sam.roll_no);
            System.out.println("Phone Number: " + sam.phoneNumber);
            System.out.println("Address: " + sam.address);
            
            // Print John's details
            System.out.println("\nDetails of John:");
            System.out.println("Name: " + john.name);
            System.out.println("Roll No: " + john.roll_no);
            System.out.println("Phone Number: " + john.phoneNumber);
            System.out.println("Address: " + john.address);
        }
    }
    
    

