//⚠️ String is a Palindrome

package Task31stmay;

import java.util.Scanner;

public class strpalin {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String rev = "";
        for(int i=name.length()-1;i>=0;i--){
            rev= rev+name.charAt(i);}
        System.out.println(rev);
            if(rev.equals(name)){
                System.out.println("palindrom");}
            else{
                    System.out.println("not a palindrom");
                }
            }
        }



