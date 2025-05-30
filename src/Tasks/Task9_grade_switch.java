
//case 'A': return "Excellent";
//case 'B': return "Very Good";
//case 'C': return "Good";
// case 'D': return "Needs Improvement";
//case 'F': return "Fail";
// default: returnHint "Invalid grade";

package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task9_grade_switch {
    public static void main(String[] args) {
        System.out.println("enter Grade of the student inn form (A,B,C,D,F)");
        Scanner rank =new Scanner(System.in);
        String input =rank.next();
        if (input.length() != 1) {
            System.out.println("Invalid input. Please enter a single letter grade.");
            return;
        }
        char grade = input.charAt(0);



            switch(grade){
                case 'A':
                    System.out.println("Excellent");
                    break;
                case 'B':
                    System.out.println("Very Good");
                    break;
                case 'C':
                    System.out.println("Good");
                    break;
                case 'D':
                    System.out.println("Needs Improvement");
                    break;
                case 'F':
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Invalid grade");



            }
        }


    }

