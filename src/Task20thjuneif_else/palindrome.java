//15) Check if a Number is a Palindrome.

package Task20thjuneif_else;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int original_num=num;
        int rev=0;

        while(num>0){
            int digit =num%10;
            rev=rev*10+digit;
            num=num/10;

        }
        if(rev==original_num){
            System.out.println(original_num+"Is a  Palindrome");
        }
        else{
            System.out.println(original_num+"Is not a palindrome");
        }

    }
}
