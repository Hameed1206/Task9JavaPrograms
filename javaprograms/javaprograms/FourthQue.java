package javaprograms;
import java.util.Scanner;
public class FourthQue {
    public static void main(String[] args) {
        // QUE 4: Print a cross pattern of stars
        
        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows for the pattern
        System.out.println("Enter the row count");
        
        // Read the number of rows input from the user
        int n = s.nextInt();
        
        // Loop through each row of the pattern
        for (int i = 1; i <= n; i++) {
            // Loop through each column of the current row
            for (int j = 1; j <= n; j++) {
                //check if the below condition is satisfied
                if (i == j || i + j == n + 1) {
                    //if yes, then print star *
                    System.out.print("*");
                } else {
                    //or print space
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
