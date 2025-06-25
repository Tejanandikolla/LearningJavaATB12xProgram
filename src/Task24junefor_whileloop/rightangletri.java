//12. Right-Angled Triangle
//*
//**
//***
package Task24junefor_whileloop;

import java.util.Scanner;

public class rightangletri {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("*".repeat(i));
        }
    }
}
