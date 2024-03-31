package javaprograms;
import java.util.Scanner;
public class ThirdQue {
    public static void main(String[] args) {
        // QUE 3: Print a pattern with increasing numbers
        
        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows for the pattern
        System.out.println("Enter the row count");
        
        // Read the number of rows input from the user
        int n = s.nextInt();
        
        // Prompt the user to initiate the output value
        System.out.println("Initiate the output value");
        
        // Read the initial value for the pattern from the user
        int k = s.nextInt();

        // Loop through each row of the pattern
        for(int i = 1; i <= n; i++){
            // Loop through each column of the current row
            for(int j = 1; j <= i; j++){
                // Print the current value of k followed by a space
                System.out.print(k + " ");
                // Increment the value of k for the next iteration
                k++;
            }
            // Move to the next line after printing each row
            System.out.println("");
        }
    }  
}
