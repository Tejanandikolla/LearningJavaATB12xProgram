//Try-Catch-Finally Example
//Write a program that demonstrates try-catch-finally block with division operation.
//
//Examples:
//Input:
//10, 2
//Output:
//Result: 5 Finally block executed
//Input:
//10, 0
//Output:
//Error: Cannot divide by zero Finally block executed

package JavaWrapperClassesGenericsExceptiontest;

import java.util.Scanner;

public class cha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers :");
        int num = scanner.nextInt();
        int div = scanner.nextInt();

        try {
            int result = num / div;
            System.out.print("Result: " + result + " ");
        } catch (ArithmeticException e) {
            System.out.print("Error: Cannot divide by zero ");
        } finally {
            System.out.println("Finally block executed");
            scanner.close();


        }
    }
}
