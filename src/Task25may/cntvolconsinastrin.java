//Count vowels and consonants in a String.

package Task25may;
import java.util.Scanner;
public class cntvolconsinastrin {
    public static void main(String[] args) {
//        String name ="teja";
        System.out.println("enter a string");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();

        name = name.toLowerCase();
        int volcount=0;
        int conscount=0;
        for(int i=0;i<name.length();i++) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    volcount++;
                } else {
                    conscount++;


                }
            }
        }
        System.out.println(volcount);
        System.out.println(conscount);
    }
}
