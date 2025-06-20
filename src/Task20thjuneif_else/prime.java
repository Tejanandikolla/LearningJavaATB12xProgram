//12) Check if a Number is Prime
package Task20thjuneif_else;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        boolean prime = true;
        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;

                }

            }

        }
        if (prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

    }
}