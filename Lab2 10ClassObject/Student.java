//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
public class Student {
    String name;
        int roll_no;
        
        public static void main(String[] args) {
            // Create an object of the Student class
            Student student = new Student();
            
            // Assign values to the object's variables
            student.name = "John";
            student.roll_no = 2;
            
            // Display the values
            System.out.println("Name: " + student.name);
            System.out.println("Roll No: " + student.roll_no);
        }
    }
    

