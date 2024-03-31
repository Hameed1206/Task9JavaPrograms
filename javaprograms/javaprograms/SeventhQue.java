package javaprograms;

import java.util.Scanner;

public class SeventhQue {
    // QUE 7 Compare the values to find the largest one
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter three values
        System.out.println("Enter three values:");
        int a = s.nextInt(); // Read the first value
        int b = s.nextInt(); // Read the second value
        int c = s.nextInt(); // Read the third value

        // Compare the values to find the largest one
        if (a > b && a > c) {
            System.out.println
            ("a = " + a + " is greater than b = " + b + " and c = " + c);
        } else if (b > a && b > c) {
            System.out.println
            ("b = " + b + " is greater than a = " + a + " and c = " + c);
        } else if (c > a && c > b) {
            System.out.println
            ("c = " + c + " is greater than a = " + a + " and b = " + b);
        }
    }
}
