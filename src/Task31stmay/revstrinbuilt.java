//Write a program to reverse a string by using an inbuilt function. -> StringBuffer - reverse()

package Task31stmay;
import java.util.Scanner;


public class revstrinbuilt {
    public static void main(String[] args) {
        System.out.println("enter a str");
        Scanner scanner =new Scanner(System.in);
        String str= scanner.next();
        StringBuffer sb=new StringBuffer(str);
        String reverse=sb.reverse().toString();
        System.out.println(reverse);
    }
}
