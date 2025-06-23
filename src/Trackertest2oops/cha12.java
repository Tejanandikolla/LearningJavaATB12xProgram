//Method Overriding Demo
//Write a program to demonstrate method overriding by creating parent and child classes with the same method signature.
//Input:
//Parent and Child objects calling display() method
//Output:
//Parent class display method Child class display method

package Trackertest2oops;

class Parent{
//    public void signature(){

//    }
    public void dispaly(){
        System.out.println("Parent class display method");
    }

}
class Child{
//    public void signature(){

//    }
    public void display(){
        System.out.println("Child class display method");
    }

}


public class cha12 {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();
        p.dispaly();
        c.display();


    }
}
