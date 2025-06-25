// Multiplication Table of a Given Number (take the input from user).
package Task24junefor_whileloop;

import java.util.Scanner;

public class multipletable {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scanner.nextInt();
        System.out.println(n+"table:");
        for(int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"="+(n*i));
        }
    }
}
