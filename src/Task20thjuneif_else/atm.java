//13) ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
//       Steps to Write the Program
//1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//2️⃣ Take user input for the amount they want to withdraw.
//3️⃣ Check withdrawal conditions:
//The amount should be greater than zero.
//The amount should be a multiple of 100 (common ATM rule).
//The amount should not exceed the account balance.
//4️⃣ Deduct the amount from the balance if conditions are met.
//5️⃣ Display the updated balance or an error message if the withdrawal fails.

package Task20thjuneif_else;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int accbal=10000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the amount you want to withdraw");
        int amount=scanner.nextInt();
        if(amount<0){
            System.out.println("Enter the amount correctly/invalid input");
        }
        else if(amount%100!=0) {
            System.out.println("Invalid input ?enter the amount in multiples of 100");
        } else if(amount>accbal){
            System.out.println("Insufficient funds");
        }
        else{
            accbal=accbal-amount;
            System.out.println("now the available balance in your  account is: "+accbal);}



        }
    }

