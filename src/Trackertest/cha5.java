//Operator Precedence and Type Casting
//Write a program that demonstrates operator precedence and type casting in Java.
//
//**Requirements:**
//- Show operator precedence with complex expressions
//- Demonstrate implicit and explicit type casting
//- Print results with explanations
//Input:
//10 3.5
//Output:
//Expression result: 23 Implicit casting: 13.5 Explicit casting: 13
package Trackertest;

public class cha5 {
    public static void main(String[] args) {
        int a =10;
        double b=3.5;
        int expressionresult=a+(int)(b*2)+6;//3.5*2-->int(7.0)-->7-->10+7=+6-->23
        //implicit type casting int to double
        double Implicitcasting=a+b;
        //explicit type casting double to int
        int Explicitcasting=a+(int)(b);
        System.out.println("Expression result:"+expressionresult+" Implicit casting:"+ Implicitcasting+" Explicit casting:"+ Explicitcasting);
    }
}
