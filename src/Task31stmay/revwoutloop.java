//Write a program to reverse a string without using a loop without using an inbuilt function. -> recursive functions in java
package Task31stmay;

import java.util.Scanner;

public class revwoutloop {
    public static String reverseString(String s){
        if(s.isEmpty()){
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0);

    }
    public static void main(String[] args) {
        System.out.println("enter a string ");
        Scanner scanner=new Scanner(System.in);
        String str= scanner.next();
       String reversed= reverseString(str);
        System.out.println(reversed);

    }
}
