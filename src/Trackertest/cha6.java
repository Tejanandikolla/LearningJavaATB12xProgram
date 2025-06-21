//Number Classification
//Write a program to check if a number is positive, negative, or zero.
//
//**Requirements:**
//- Read an integer from user input
//- Use if-else statements to classify the number
//- Print appropriate message for each case
//Input:
//15
//Output:
//15 is positive
package Trackertest;

import java.util.Scanner;

public class cha6 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        if(num>0){
            System.out.println(num+" is positive");}
        else if(num<0){
            System.out.println(num+" is negative");}
        else {
            System.out.println(num+" is zero");
        }


        }
    }

