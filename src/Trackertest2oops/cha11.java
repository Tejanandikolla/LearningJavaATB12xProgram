//Calculator Method Overloading
//Write a program to demonstrate method overloading by creating multiple "add" methods with different parameters.
//Input:
//add(5, 3), add(2.5, 3.7), add(1, 2, 3)
//Output:
//Integer addition: 8 Double addition: 6.2 Three integers addition: 6

package Trackertest2oops;

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}

public class cha11 {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println("Integer addition:"+c.add(5,3));
        System.out.println("Double addition:"+c.add(2.5,3.7));
        System.out.println("Three integers addition:"+c.add(1,2,3));


    }
}
