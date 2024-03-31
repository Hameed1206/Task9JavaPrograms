package javaprograms;
import java.util.Scanner;
public class FirstandSecondQue {
    public static void main(String[] args) {
        //QUE 1
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String word = s.next();
        String output = "";
        for(int i=word.length()-1; i>=0; i--){
            char c = word.charAt(i);
            output = output+c;
        }
        if (word.equals(output)) {
            System.out.println(word+" is a palindrome");   
        }  else{
            System.out.println(word+" is not a palindrome");
        }
// ===============================================================
        // QUE 2
        System.out.println("");
        System.out.println("* * Second Question below * *");
        System.out.println("");
        System.out.println("Enter the String");
        String name = s.next();
        String output1 = "";
        for(int i=name.length()-1; i>=0; i--){
            char c = name.charAt(i);
            output1 = output1+c;
        }
        System.out.println(output1);
    }
}
