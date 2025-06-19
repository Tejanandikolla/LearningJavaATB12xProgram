//3) Find the Maximum of Two Numbers.

package Task17th_juneifelse;

import java.util.Scanner;

public class maxof2 {
    public static void main(String[] args) {
        Scanner number =new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int num1=number.nextInt();
        int num2=number.nextInt();
        if(num1>num2){
            System.out.println(num1+ " is the max number");}
        else{
            System.out.println(num2+"  is the max number");
        }
    }
}
