//6) Find the Largest of Three Numbers.
package Task19thjune_ifelse;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class maxofthress {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(("enter 3 numbers to know which is the max one"));
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+"--Is Max");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2+"--Is Max");
        }
        else{
            System.out.println(num3+"--Is Max");
        }
    }
}
