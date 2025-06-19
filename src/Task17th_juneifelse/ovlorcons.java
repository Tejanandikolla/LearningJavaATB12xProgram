//4) Check if a Character is a Vowel or Consonant.
package Task17th_juneifelse;

import java.util.Scanner;

public class ovlorcons {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("enter a character");
       char ch=scanner.next().toLowerCase().charAt(0);
       if(!Character.isLetter(ch)){
           System.out.println("enter a valid input ");
       }
       else if(ch =='a'||ch =='e'||ch=='i'||ch=='0'||ch=='u'){
           System.out.println(ch+" is a vowel");}
       else{
           System.out.println(ch +"is a consonant");

       }
    }

}
