//Write a program to reverse a string without using inbuilt functions.-> forloop
package Task31stmay;

import java.util.Scanner;

public class strrev {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner scanner =new Scanner(System.in);
        String str= scanner.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
