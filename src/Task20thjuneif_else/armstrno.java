//16) Check if a Number is an Armstrong Number.

package Task20thjuneif_else;

import java.util.Scanner;


public class armstrno {
    static int pow(int base,int expo){
        int res=1;
        for(int i=1;i<=expo;i++){
            res *=base;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enetr a number:");
        int num=scanner.nextInt();
        int original_num=num;
        int res=0;
        int n=String.valueOf(num).length();
        while(num>0){
            int digit=num%10;
//            res += Math.pow(digit,n);
            res += pow(digit,n);
            num /= 10;
        }
        if(res==original_num){
            System.out.println(original_num+"Is a Armstrongnumber");
        }else{
            System.out.println(original_num+"Is not a Armstrongnumber");
        }
    }

}
