//3) Rectangle Area Using Constructor
//➤ Create a Rectangle class. Pass length and breadth via constructor, calculate and print area.

package Task9thjune_constructorprgrs;

import java.util.Scanner;

class Rectangle{
    double length;
    double breadth;
    Rectangle(){
        System.out.println("dc");
    }
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    public double cal_area(){
        return  length*breadth;
    }

}

public class Rectanglearea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        double len= scanner.nextDouble();
        System.out.println("Enter breadth ");
        double breth=scanner.nextDouble();
        Rectangle rect=new Rectangle(len,breth);
        double area= rect.cal_area();
        System.out.println("Area of the Rectangle is:"+area);

    }
}
