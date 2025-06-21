//Create a Java program that demonstrates various arithmetic and assignment operators.
//
//**Requirements:**
//- Use +, -, *, /, % operators
//- Demonstrate assignment operators (=, +=, -=, *=, /=)
//- Show the results of each operation
//Input:
//10 5
//Output:
//Addition: 15 Subtraction: 5 Multiplication: 50 Division: 2 Modulus: 0
package Trackertest;

public class cha2 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("Addition:"+sum+" Subtraction:"+sub+" Multiplication:"+mul+" Division:"+div +" Modulus: "+div+"mod:"+mod);
    }
}
