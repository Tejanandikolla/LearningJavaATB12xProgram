//Increment and Decrement Operators
//Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
//
//**Requirements:**
//- Show the difference between ++i and i++
//- Show the difference between --i and i--
//- Print values before and after operations
//Input:
//5
//Output:
//Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)
package Trackertest;

public class cha4 {
    public static void main(String[] args) {
        int i=5;
        System.out.println("Original:"+(i)+" Pre-increment:"+(++i) +" Post-increment:"+(i++)+" (returned 6) "+"(became 7)" +" Pre-decrement:"+(--i) +" Post-decrement:" + (i--)+ " (returned 6)"+" (became 5)");

    }
}
