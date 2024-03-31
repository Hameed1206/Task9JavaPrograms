package javaprograms;
import java.util.Scanner;
public class FirstQue {
    public static void main(String[] args) {
        // QUE 1: Palindrome Check
        
        // Creating a Scanner object to take user input
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter the String");
        
        // Read the string input from the user
        String word = s.next();
        
        // Initialize an empty string to store the reverse of the input string
        String output = "";
        
        // Reverse the input string
        for(int i = word.length() - 1; i >= 0; i--){
            // Retrieve each character of the input string starting from the end
            char c = word.charAt(i);
            // Append the character to the output string
            output = output + c;
        }
        
        // Check if the input string is equal to its reverse (Palindrome check)
        if (word.equals(output)) {
            System.out.println(word + " is a palindrome");   
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
