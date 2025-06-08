//Reverse the number using for loop. (In - 12345, Out - 54321)
package Task25may;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        System.out.println("enter a number to reverse");
        Scanner numb =new Scanner(System.in);
        int num =numb.nextInt();
//        int num = 12345;
        int rev =0;
        for (;num!=0; num /=10){
            int digit=num%10;
            rev = rev*10+digit;

        }
        System.out.println("reversed number is "+rev);
    }
}

