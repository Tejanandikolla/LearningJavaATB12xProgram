package Task25may;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
//        int n=5;
        int res =n;
        for(int i=1;i<n;i++){
            res =res*i;
        }
        System.out.println(res);

    }
}
