//9) Check if a Year is a Leap Year.
package Task19thjune_ifelse;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a year to know leap year or not");
        int year=scanner.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(isLeapYear){
            System.out.println(year+"--Is a leap year");
        }
        else{
            System.out.println(year+"--Is not a leap year");
        }
    }

}
