package javaprograms;
import java.util.Scanner;
public class FifthQue {
    // QUE 5 // Determine the grade based on the marks
    // Declare a static variable to store the marks
       static int marks;
public static void main(String[] args) {
    // Create a Scanner object to take user input
    Scanner s = new Scanner(System.in);

    // Prompt the user to enter the marks
    System.out.print("Enter the marks: ");
    
    // Read the marks input from the user
    marks = s.nextInt();

    // Determine the grade based on the marks
    if (marks < 50) {
        System.out.println("The grade for " + marks + " is 'F'");
    } else if (marks >= 50 && marks <= 59) {
        System.out.println("The grade for " + marks + " is 'E'");
    } else if (marks >= 60 && marks <= 69) {
        System.out.println("The grade for " + marks + " is 'D'");
    } else if (marks >= 70 && marks <= 79) {
        System.out.println("The grade for " + marks + " is 'C'");
    } else if (marks >= 80 && marks <= 89) {
        System.out.println("The grade for " + marks + " is 'B'");
    } else if (marks >= 90 && marks <= 99) {
        System.out.println("The grade for " + marks + " is 'A'");
    } else if (marks == 100) {
        System.out.println("The grade for " + marks + " is 'S'");
    } else {
        // Handle invalid input
        System.out.println("Invalid Input, Please enter the correct value");
    }
}
}
