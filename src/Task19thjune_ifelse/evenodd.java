//2)Check if a Number is Even or Odd.
package Task19thjune_ifelse;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        if(num%2==0){
            System.out.println(num+"--is even");
        }
        else {
            System.out.println(num+"--is odd");
        }
    }
}
