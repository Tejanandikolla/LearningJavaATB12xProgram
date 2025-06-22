//Factorial Calculator (While Loop)
//Create a program to calculate factorial of a number using while loop.
//
//**Requirements:**
//- Read a positive integer from user input
//- Use while loop to calculate factorial
//- Handle edge case for 0! = 1
//- Use appropriate data type to handle large results
//5
//Output:
//Factorial of 5 is: 120
package Trackertest;

import java.util.Scanner;

public class cha12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a +ve number to know factorial");
        int n = scanner.nextInt();
        int fact = 1;
        if(n<0) {
            System.out.println("Invalid input enter +ve numbers");

        }
        else if (n == 1) {
            System.out.println("Factorial of " + n + " is:" + n);
        } else {
            for (int i = 2; i <=n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is:" + fact);

        }
    }
}
