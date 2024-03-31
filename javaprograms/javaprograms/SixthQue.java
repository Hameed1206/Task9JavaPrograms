package javaprograms;
import java.util.Scanner;
public class SixthQue {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the month");
        int month = s.nextInt();
        System.out.println("Enter the standard room rent");
        float rent = s.nextFloat();
        System.out.println("Standard room rent per day is "+rent);
        System.out.println("Enter the no of days");
        int days =  s.nextInt();

        float roomRent = 1.0f;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                roomRent = 1.2f;
                break;
        
            default:
            roomRent = 1.0f;
                break;
        }
        float tariff = rent*roomRent*days;
        String TariffFormatted = String.format("%.2f", tariff);
        System.out.println("Total Tariff for "+days+" days is "+TariffFormatted);
    }
}
