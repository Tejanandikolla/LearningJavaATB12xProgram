//14. Pyramid Pattern
//    *
//   ***
//  *****
// *******
//*********

package Task24junefor_whileloop;

import java.util.Scanner;

public class pyramidpattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
