//Vehicle Inheritance Hierarchy
//Create a Vehicle base class with start() method. Create Car and Bike subclasses that override the start() method.
//Input:
//Vehicle[] vehicles = {new Car(), new Bike()}; call start() on each
//Output:
//Car engine starts with a roar! Bike engine starts with a purr!

package Trackertest2oops;
class Vehicle{
    void start(){
    System.out.println("Vehicle starting.....!");
    }
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.print("Car engine starts with a roar!");
    }
}
class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println(" Bike engine starts with a purr!");
    }
}






public class cha6 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bike()};
        for(Vehicle v:vehicles){
            v.start();


        }


    }
}
