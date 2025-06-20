package Task20thjuneif_else;

import java.util.Scanner;

public class numberpalindrom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=scanner.nextInt();
        int originalnum=num;
        int rev=0;
        if (num != 0&& num>0 ) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
            if (originalnum == rev) {
            System.out.println(originalnum + " is a palindrome number");}
            else {
            System.out.println(originalnum + " is not a palindrome number");}}
        else {
                System.out.println("Enter correct input");
        }
        }
    }

