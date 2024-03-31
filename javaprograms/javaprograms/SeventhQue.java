package javaprograms;

import java.util.Scanner;

public class SeventhQue {
    
    static int d;
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a>b && a>c) {
            System.out.println("a = "+a+" is greater than b = "+b+" and c = "+c);
                }
        else if (b>a && b>c) {
            System.out.println("b = "+b+" is greater than a = "+a+" and c = "+c);
        }
        else if(c>a && c>b){
            System.out.println("c = "+c+" is greater than a = "+a+" and b = "+b);
        }
    }
}
