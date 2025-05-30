package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task7_calender {
    public static void main(String[] args) {
        System.out.println("enter month in the form of 1-12");
        Scanner cal = new Scanner(System.in);
//        int mon = cal.nextInt();
//        int year = cal.nextInt();
        if (cal.hasNextInt()) {
            int mon = cal.nextInt();
            int year = cal.nextInt();


            switch (mon) {
                case 1 -> System.out.println("name of the month january");
                case 2 -> System.out.println("name of the month feb");
                case 3 -> System.out.println("name of the month mar");
                case 4 -> System.out.println("name of the month april");
                case 5 -> System.out.println("name of the month May");
                case 6 -> System.out.println("name of the month June");
                case 7 -> System.out.println("name of the month July");
                case 8 -> System.out.println("name of the month August");
                case 9 -> System.out.println("name of the month September");
                case 10 -> System.out.println("name of the month October");
                case 11 -> System.out.println("name of the month november");
                case 12 -> System.out.println("name of the month December");


            }
            switch (mon) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("no of days in this month are 31");
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ;
                    System.out.println("it is a leap year it has 29 days in this month");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("no of days in the month are 30");
                    break;
                default:
                    System.out.println("enter correct input as mentioned and try again ....");

            }

        }

    }
}

