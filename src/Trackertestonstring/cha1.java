//String Manipulation Basics
//Write a Java program that demonstrates basic string operations including concatenation, length, substring, and character extraction.
//
//Examples:
//Input:
//Hello World
//Output:
//Length: 11, First char: H, Substring: World

package Trackertestonstring;

public class cha1 {
    public static void main(String[] args) {
        String s ="Hello World";
        int len=s.length();
        char c=s.charAt(0);
        String sub=s.substring(6,11);
        System.out.println("Length:"+len+" First char:"+c+"  Substring:"+ sub);
    }

}
