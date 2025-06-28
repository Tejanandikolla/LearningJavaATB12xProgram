//String Comparison and Equality
//Create a program that demonstrates different ways to compare strings in Java, including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
//
//Examples:
//Input:
//String1: "Hello", String2: "hello", String3: "Hello"
//Output:
//equals(): false, equalsIgnoreCase(): true, compareTo(): -32
package Trackertestonstring;

public class cah2 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="hello";
        String s3="Hello";
        System.out.println("equals():"+s1.equals(s2)+"  equalsIgnoreCase():"+s1.equalsIgnoreCase(s2)+"  compareTo():"+s3.compareTo(s2));

    }
}
