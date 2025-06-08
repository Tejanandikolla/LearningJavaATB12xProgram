package Task25may;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
//        int n = 5;
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int fir = 0, sec = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(fir);
            int res = fir+sec;
            fir=sec;
            sec=res;


        }

    }
}
