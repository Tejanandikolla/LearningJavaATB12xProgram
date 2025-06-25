package Task24junefor_whileloop;

import java.util.Scanner;

public class invertedtriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        for (int i = n; i<=n ; i--) {
            System.out.println("*".repeat(i));

        }
    }
}
