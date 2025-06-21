//Simple Calculator (Switch Statement)
//Write a program to create a simple calculator using switch statement.
//
//**Requirements:**
//- Read two numbers and an operator (+, -, *, /)
//- Use switch statement to perform the operation
//- Handle division by zero
//- Display the result
//15.5 4.5 +
//Output:
//Result: 20.0
package Trackertest;

import java.util.Scanner;

public class cha10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 values");
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        System.out.println("enter an operator (+, -, *, /) ");
        char opr= scanner.next().charAt(0);
    }
}
