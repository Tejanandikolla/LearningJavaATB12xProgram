//11. Calculate the factorial of a number using a for loop:
package Task24junefor_whileloop;

import java.util.Scanner;

public class fact_for {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enetr a number:");
        int fact=1;
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            fact *=i;

        }
        System.out.println("Factorial of a Number:"+fact);
    }
    }

