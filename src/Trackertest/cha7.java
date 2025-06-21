//Find Largest of Three Numbers
//Create a program to find the largest among three numbers using if-else statements.
//
//**Requirements:**
//- Read three integers from user input
//- Use nested if-else or if-else if statements
//- Handle cases where numbers might be equal
//Input:
//15 27 19
//Output:
//Largest number is: 27
package Trackertest;

import java.util.Scanner;

public class cha7 {
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
        System.out.println(("enter 3 numbers to know which is the Largest one"));
//        int num1=scanner.nextInt();
//        int num2=scanner.nextInt();
//        int num3=scanner.nextInt();
        int num1=15, num2=27, num3 =19;
        if(num1>num2 && num1>num3){
            System.out.println("Largest number is:"+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Largest number is:"+num2);
        }
        else{
            System.out.println("Largest number is:"+num3);
        }
    }
}
