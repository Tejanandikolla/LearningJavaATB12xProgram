//Task 1: Add Two Numbers
//Title: Overload a method to add different types of number
//Description:
//Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
//The int version should add two integers.
//The double version should add two decimal numbers.
//In the main method, call both versions to demonstrate how overloading works with data types.

package Task10thjuly.MethodOverloading;

class Calculator{
    Calculator(){
        System.out.println("DC");
    }
    public void add(Integer a,Integer b){
        Integer res=a+b;
        System.out.println("Integer Addition result: "+res);
    }
    public void add(Double a , Double b){
        Double res=a+b;
        System.out.println("Double addition result:"+res);
    }
}

public class addtwonumbers {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(2,3);
        c.add(2.3,3.4);
    }
}
