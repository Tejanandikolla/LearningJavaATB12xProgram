//4) Check if a Character is a Vowel or Consonant.
package Task19thjune_ifelse;

import java.util.Scanner;

public class ovlorcons {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=scanner.next().toLowerCase().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch+"--is Vowel");
        }
        else{
            System.out.println(ch+"--is consonant");
        }
    }
}
