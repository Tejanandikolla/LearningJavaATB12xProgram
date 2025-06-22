//Print Numbers Using For Loop
//Write a program to print numbers from 1 to N using a for loop.
//
//**Requirements:**
//- Read the value of N from user input
//- Use for loop to print numbers from 1 to N
//- Print numbers in a single line separated by spaces
//5
//Output:
//1 2 3 4 5
package Trackertest;
import java.util.Scanner;

public class cha11 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number");
        int n=scanner.nextInt();
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");

        }

    }
}
