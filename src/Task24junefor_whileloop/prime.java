// Check if a Number is Prime
package Task24junefor_whileloop;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scanner.nextInt();
        boolean prime=true;
        if(n<=1){
            prime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(i%2==0){
                    prime=false;
                    break;
                }
            }
        }
    if(prime){
        System.out.println(n+"Is prime number");
    }
    else{
        System.out.println(n+"Is not a prime number");
    }


    }
}
