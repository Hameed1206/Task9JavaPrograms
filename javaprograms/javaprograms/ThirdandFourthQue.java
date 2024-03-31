package javaprograms;
import java.util.Scanner;
public class ThirdandFourthQue {
    public static void main(String[] args) {
        //QUE 3
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the row count");
       int l = s.nextInt();
       System.out.println("Initiate the output value");
       int k = s.nextInt();
       System.out.println("See the output below");

        for(int i=1; i<=l; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k+" ");
                k++;  }
            System.out.println("");
        }
        System.out.println("");
       System.out.println("*  * Fourth Que below *  *");
       System.out.println("");
//================================================================        
       //QUE 4
        System.out.println("Enter the row count");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");   }
            }
            System.out.println();
        }
    }
}
