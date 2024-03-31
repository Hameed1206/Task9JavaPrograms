package javaprograms;
import java.util.Scanner;
public class SixthQue {
    public static void main(String[] args) {

        //QUE 6 // Create a Scanner object to take user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter the month
        System.out.println("Enter the month (1-12):");
        int month = s.nextInt();

        // Prompt the user to enter the standard room rent
        System.out.println("Enter the standard room rent:");
        float rent = s.nextFloat();

        // Display the standard room rent per day
        System.out.println("Standard room rent per day is " + rent);

        // Prompt the user to enter the number of days
        System.out.println("Enter the number of days:");
        int days = s.nextInt();

        // Define a variable to store the room rent factor
        float roomRent = 1.0f;

        // Determine the room rent factor based on the month
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                roomRent = 1.2f; // Room rent is 20% higher during peak season
                break;
            default:
                roomRent = 1.0f; // Room rent is standard for other months
                break; }

        // Calculate the total tariff
        float tariff = rent * roomRent * days;

        // Format the total tariff to have exactly two decimal places
        String tariffFormatted = String.format("%.2f", tariff);

        // Display the total tariff for the specified number of days
        System.out.println("Total Tariff for " + days + " days is " + tariffFormatted);
    }
}
