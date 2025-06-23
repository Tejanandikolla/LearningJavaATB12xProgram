//Drawable Interface Implementation
//Create an interface "Drawable" with a method "draw()". Implement this interface in classes "Circle" and "Rectangle".
//Input:
//Create Circle and Rectangle objects, call draw() method
//Output:
//Drawing a Circle Drawing a Rectangle
package Trackertest2oops;
interface Drawable{
    void draw();
}
class Circle1 implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }

}
class Rectangle1 implements Drawable{
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");

    }
}



public class cha9 {
    public static void main(String[] args) {
        Drawable d1= new Circle1();
        Drawable d2=new Rectangle1();
        d1.draw();
        d2.draw();
    }
}
