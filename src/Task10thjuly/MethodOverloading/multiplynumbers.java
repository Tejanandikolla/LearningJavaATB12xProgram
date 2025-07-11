//Task 3: Multiply Numbers
//Title: Multiply using overloaded methods
//Description:
//Create a class MathOperations with two multiply() methods:
//One takes two integers and returns the product
//Another takes three integers and returns their product
//This helps students understand how Java distinguishes methods based on parameter count.

package Task10thjuly.MethodOverloading;

class MathOperations{
    void multiply(Integer a,Integer b){
        System.out.println(a+"*"+b+"="+a*b);

    }
    void multiply(Integer a,Integer b,Integer c){
        System.out.println(a+"*"+b+"*"+c+"="+a*b*c);
    }
}

public class multiplynumbers {
    public static void main(String[] args) {
        MathOperations res= new MathOperations();
        res.multiply(2,3);
        res.multiply(2,3,4);
    }
}
