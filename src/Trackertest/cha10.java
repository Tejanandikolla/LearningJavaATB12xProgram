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
        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        System.out.println("enter an operator (+, -, *, /) ");
        char opr= scanner.next().charAt(0);
        switch(opr){
            case '+':{
                System.out.println("Result:"+(a+b));
                break;
            }
            case '-':{
                System.out.println("Result:"+(a-b));
                break;
            }
            case '*':{
                System.out.println("Result:"+(a*b));
                break;

            }
            case '/':{
                if(b!=0){
                System.out.println("Result:"+(a/b));}
                else{
                    System.out.println("Division by zero is not allowed :");
                }
                break;
            }
            default:{
                System.out.println("invalid input ");
            }

        }

    }
}
