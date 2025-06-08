//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100,B: 80-89,C: 70-79,D: 60-69,F: 0-59
package Task25may;

import java.util.Scanner;

public class Gradecal {
    public static void main(String[] args) {
        System.out.println("enter marks of the student");
        Scanner scanner=new Scanner(System.in);
        int marks=scanner.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Grade of the student 'A'");}
        else if(marks>=80 && marks<=89){
                System.out.println("Grade of the student 'B'");}
        else if(marks>=70 && marks<=79){
            System.out.println("Grade of the student 'C'");}
        else if(marks>=60 && marks<=69) {
            System.out.println("Grade of the student 'D'");}
        else{
            System.out.println("Fail");




            }

        }



    }

