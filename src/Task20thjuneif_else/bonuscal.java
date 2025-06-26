//19)  Calculate Bonus Based on Salary and Years of Experience.
//          :- take the salary and Year info from the User.
//Implement Bonus Calculation Logic:
//     Define the bonus structure based on salary and years of experience.
//           :- If years of experience is less than 1 year: No bonus.
//           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
package Task20thjuneif_else;

import java.util.Scanner;

public class bonuscal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter salary and years of experience");
        double salary=scanner.nextDouble();
        int year_exp=scanner.nextInt();
        double bonus=0;
        if(year_exp<1){
            System.out.println("No bonus");
        }
        else if(year_exp>=1&&year_exp<=3){
            bonus=salary*0.05;
            System.out.println("Bonus :"+bonus);

        }
        else if(year_exp>=4&&year_exp<=6){
            bonus=salary*0.10;
            System.out.println("Bonus :"+bonus);
        }
        else{
            bonus=salary*0.15;
            System.out.println("Bonus :"+bonus);
        }


    }
}
