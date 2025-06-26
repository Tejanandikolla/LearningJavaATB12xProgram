//17)  Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
//    * Take the below User info and store it into the variables:
//              Age (integer)
//              Salary (double or float)
//              Credit Score (integer)
//    Age Validation:
//              :- Check if the age is a positive integer.
//              :- Ensure the age is at least 18 years old.
//              :- Max age can be 80.
//    Salary Validation:
//             :- Check if the salary is a positive number.
//             :- Define a minimum salary threshold (e.g., 30,000).
//    Credit Score Validation:
//             :- Check if the credit score is a positive integer.
//             :- Define a minimum credit score threshold (e.g., 650).
//             :- Max credit score threshold (e.g., 850).

package Task20thjuneif_else;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        double salary=scanner.nextDouble();
        int credit_score= scanner.nextInt();
        int max_salary=30000;
        int min_credit=650;
        int max_credit=850;
        if(age>18 && age<=80) {
            if (salary > 0 && salary > max_salary) {
                if (credit_score > 0 && credit_score > min_credit && credit_score<max_credit) {
                    System.out.println("You are Eligible for Loan");
                } else {
                    System.out.println("you are credit score should be less than"+max_credit);
                }
            } else {
                System.out.println("you salary should be morethan" + max_salary);
            }
        }else{
            System.out.println("Your age should be >18and <=80");
            }

        }



    }

