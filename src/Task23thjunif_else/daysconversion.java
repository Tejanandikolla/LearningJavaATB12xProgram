//23) Convert Days into Years, Months, and Days.
//
//       :- Take the Days Input from the User
//
//    Define the conversion logic:
//
//        :- Assume 1 year = 365 days.
//
//        :- Assume 1 month = 30 days
//
//        :- Convert the Days into Years, Month and days and Print it.
//
//if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
package Task23thjunif_else;

import java.util.Scanner;

public class daysconversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of days");
        int totaldays=scanner.nextInt();
        int years=0,months=0,days=0;
        if(totaldays>=365){
            years=totaldays/365;
            totaldays=totaldays%365;
        }else{
            years=0;
        }
        if(totaldays>=30){
            months=totaldays/30;
            totaldays=totaldays%30;

        }else{
            months=0;

        }
        if (totaldays>0){
            days=totaldays;
        }else{
            days=0;
        }
        System.out.println("Converted: " + years + " years, " + months + " months, and " + days + " days.");
    }
}
