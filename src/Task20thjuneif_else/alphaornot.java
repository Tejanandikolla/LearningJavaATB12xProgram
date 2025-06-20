//11) Check if a Character is an Alphabet.
package Task20thjuneif_else;

import java.util.Scanner;

public class alphaornot {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enetr a Character");
        char ch=scanner.next().toLowerCase().charAt(0);
        if(Character.isAlphabetic(ch)){
            System.out.println(ch+"--Is alphabet");
        }
        else{
            System.out.println(ch+"--Is not alphabet");
        }
    }


}
