//How to Convert String to Integer to String in Java with Example
public class StringToIntToString {
        public static void main(String[] args) {
            // Convert String to int
            String strNumber = "42";
            int intValue = Integer.parseInt(strNumber);
    
            System.out.println("String to int: " + intValue);
    
            // Convert int to String
            int number = 99;
            String strValue = String.valueOf(number);
    
            System.out.println("int to String: " + strValue);
        }
    }
    
    

