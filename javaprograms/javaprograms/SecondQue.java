package javaprograms;
import java.util.Scanner;
public class SecondQue {
    public static void main(String[] args) {
          // QUE 2: Reverse a String
        
        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter the String");
        
        // Read the string input from the user
        String name = s.next();
        
        // Initialize an empty string to store the reverse of the input string
        String output = "";
        
        // Reverse the input string
        for(int i = name.length() - 1; i >= 0; i--){
            // Retrieve each character of the input string starting from the end
            char c = name.charAt(i);
            // Append the character to the output string
            output = output + c;
        }
        
        // Print the reversed string
        System.out.println(output);
    }
}
