// Factorial of a Number
package Task24junefor_whileloop;

import java.util.Scanner;

public class fact_whileloop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enetr a number:");
        int fact=1;
        int n=scanner.nextInt();
        int i=1;
        while(i<=n){
            fact *=i;
            i++;

        }
        System.out.println(fact);
    }
}
