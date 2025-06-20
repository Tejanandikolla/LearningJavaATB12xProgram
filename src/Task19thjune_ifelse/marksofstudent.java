//10) Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
//1️⃣ Take user input for marks (Use Scanner class).
//2️⃣ Check the validity of marks (ensure they are between 0 and 100).
//3️⃣ Use if-else-if conditions to determine the grade based on marks.
//4️⃣ Display the grade as output.
//📌 Grading Criteria (Example)
//Marks Range Grade
//90 - 100   A+
//80 - 89     A
//70 - 79      B
//60 - 69     C
//50 - 59      D
//40 - 49      E
//Below 40   Fail

package Task19thjune_ifelse;

import java.util.Scanner;

public class marksofstudent {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Student Marks");
        int marks=scanner.nextInt();
        if(marks>100 || marks<0){
            System.out.println("invalid input enter marks<=100 && marks>0");}
        else if(marks>=90 &&marks<=100){
            System.out.println("Grade is A+");}
        else if(marks>=80 &&marks<=89){
            System.out.println("Grade is A");}
        else if(marks>=70 &&marks<=79){
            System.out.println("Grade is B");}
        else if(marks>=60 &&marks<=69){
            System.out.println("Grade is C");}
        else if(marks>=50 &&marks<=59){
            System.out.println("Grade is D");}
        else if(marks>=40 &&marks<=49){
            System.out.println("Grade is E");}
        else{
            System.out.println("Fail");


        }
    }
}
