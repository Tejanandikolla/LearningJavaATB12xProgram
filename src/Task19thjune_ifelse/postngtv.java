//1) Check if a Number is Positive or Negative.

package Task19thjune_ifelse;

import java.util.Scanner;

public class postngtv {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a  number");
        int num=scanner.nextInt();
        if(num>0){
            System.out.println(num+" is a positive number");}

        else{
            System.out.println((num+" is a negative number"));
        }


    }
}

