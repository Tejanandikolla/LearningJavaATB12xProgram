package Task25may;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        String name="teja";
        System.out.println("enter a string");
        Scanner scanner=new Scanner(System.in);
        String name =scanner.nextLine();
        for(int i=name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

    }
}
