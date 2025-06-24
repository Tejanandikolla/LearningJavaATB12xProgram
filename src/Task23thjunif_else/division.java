//22)  Check if a Number is Divisible by 5 and 11

package Task23thjunif_else;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println(n+" Is divisible by 5 and 11");
        }
        else{
            System.out.println("It is not divisible by 5 and 11");
        }
    }
}
