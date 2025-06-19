//7) Find the Smallest of Two Numbers.
package Task19thjune_ifelse;

import java.util.Scanner;

public class smalstoftwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 number to know the smallest one:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if(num1<num2){
            System.out.println(num1+"--Is the smallest one");
        }
        else {
            System.out.println(num2+"--Is the smallest one");
        }
    }
}
