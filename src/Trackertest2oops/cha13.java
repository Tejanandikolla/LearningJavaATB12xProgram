//Outer and Inner Class Implementation
//Create a class "Outer" with an inner class "Inner". Access the inner class from the outer class and demonstrate their interaction.
//Input:
//Outer class with variable x=10, Inner class accessing x
//Output:
//Outer class variable x: 10 Inner class accessing outer variable: 10

package Trackertest2oops;
class Outer{
    int x=10;
    class Inner{
        void display(){
            System.out.println("Inner class accessing outer variable:"+x);
        }
    }
    void display(){
        System.out.println("Outer class variable x:"+x);
        Inner inner=new Inner();
        inner.display();
    }
}

public class cha13 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.display();

    }
}
