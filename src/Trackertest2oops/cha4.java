//Bank Account Encapsulation
//Create a BankAccount class with private balance field. Implement deposit(), withdraw(), and getBalance() methods with proper validation.
//Input:
//Initial balance: 1000, deposit: 500, withdraw: 200
//Output:
//Balance after deposit: 1500.0 Balance after withdrawal: 1300.0
package Trackertest2oops;

class Backaccount{
    private double balance=1000;


    public void deposit(int dep){
        balance +=dep;
        System.out.println("Balance after deposit:"+balance);


    }
    public  void withdraw(int widra){
        balance -=widra;
        System.out.println("Balance after withdrawal:"+balance);

    }
    public void getBalance(){
        this.balance=balance;
        System.out.println(balance);
    }
}


public class cha4 {
    public static void main(String[] args) {
        Backaccount c1=new Backaccount();
        c1.getBalance();
        c1.deposit(500);
        c1.withdraw(200);

    }
}
