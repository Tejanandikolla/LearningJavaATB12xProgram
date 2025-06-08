//Palidrome of String (chatAt())

package Task25may;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("palindrom");}
        else{
            System.out.println("not a palindrom");
        }
    }
        }


