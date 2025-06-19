//3) Find the Maximum of Two Numbers.

package Task19thjune_ifelse;

import java.util.Scanner;

public class maxof2 {
    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);
        System.out.println("enter numbers to check max one");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1>num2){
            System.out.println(num1+"--is max");
        }
        else{
            System.out.println(num2+"--is max");
        }


    }
}
