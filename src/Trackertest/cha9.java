//Day of the Week (Switch Statement)
//Create a program using switch statement to display the day of the week.
//
//**Requirements:**
//- Read a number (1-7) representing day of week
//- Use switch statement to print corresponding day name
//- Handle invalid input with default case
//1
//Output:
//Monday

package Trackertest;

import java.util.Scanner;

public class cha9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number form (1-7) to know days of a week");
        int d=scanner.nextInt();
        switch (d){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid input");


        }

    }
}
