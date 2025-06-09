//Write a program to reverse a string without using a loop without using an inbuilt function. -> recursive functions

package Task31stmay;
import java.util.Scanner;
public class revstr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);
    }


    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        // Recursive call: reverse rest of string + first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
