//2)Check if a Number is Even or Odd.

package Task17th_juneifelse;

import java.util.Scanner;

public class evnorodd {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=number.nextInt();
        if(num%2==0){
            System.out.println("Even number");}
        else{
            System.out.println("Odd number");

        }
    }
}
