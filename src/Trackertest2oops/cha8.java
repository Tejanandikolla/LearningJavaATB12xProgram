//Abstract Shape Implementation
//Implement an abstract class "Shape" with an abstract method "getArea()". Create subclasses "Rectangle" and "Circle" and implement "getArea()" for each.
//Input:
//Rectangle: length=5, width=3; Circle: radius=4
//Output:
//Rectangle Area: 15.0 Circle Area: 50.26548245743669
package Trackertest2oops;
abstract class Shape{
    abstract void getArea();
}
class Rectangle{
    void getArea(int len,int width){
//        len =5;
//        width=3;
        System.out.println("Rectangle Area:"+(len*width));
    }

}
class Circle{
    void getArea(int radius){
        System.out.println("Circle Area:"+(Math.PI*(radius*radius)));
    }

}

public class cha8 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();
        rectangle.getArea(5,3);
        circle.getArea(4
        );


    }
}
