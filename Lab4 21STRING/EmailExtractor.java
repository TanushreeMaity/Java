//Extract  mail id from the given text.
//text: Hey, there how are you? this is my email id  great123@gmail.com
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailExtractor {
    public static void main(String[] args) {
        String text = "Hey, there how are you? this is my email id  great123@gmail.com";

        // Define a regular expression pattern for matching email addresses
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,7}\\b");

        // Create a Matcher object and apply the pattern to the input text
        Matcher matcher = pattern.matcher(text);

        // Iterate through the text and extract email addresses
        while (matcher.find()) {
            String email = matcher.group();
            System.out.println("Email Address: " + email);
        }
    }
}

    

