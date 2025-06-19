//1) Check if a Number is Positive or Negative.


package Task17th_juneifelse;

import java.util.Scanner;

public class positivenegativeno {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        System.out.println("enter a number");
        int number = num.nextInt();

        if (number >=0) {
            System.out.println(number+" is a positive number");}
        else{
            System.out.println(number+" is a -ve number");


        }
    }
}

