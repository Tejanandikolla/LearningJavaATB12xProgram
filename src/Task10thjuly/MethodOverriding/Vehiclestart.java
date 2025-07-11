// Task 2: Vehicle Start
//Title: Demonstrate engine start behavior using overriding
//Description:
//Create a base class Vehicle with a method start().
//Create Bike and Car classes that override the start() method:
//Bike prints "Kick start the bike"
//Car prints "Turn the key to start the car"
//This shows how polymorphism works with method overriding.

package Task10thjuly.MethodOverriding;
class Vehicle{
    Vehicle(){
        System.out.println("DC");
    }
    public void start(){
        System.out.println("Vehicle starting .......");
    }
}
class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike DC");
    }
    public void start(){
        System.out.println("Kick start the bike");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("Car DC");
    }
    public void start(){
        System.out.println("Turn the key to start the car");
    }
}

public class Vehiclestart {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.start();
        System.out.println();
        Bike tvs=new Bike();
        tvs.start();
        System.out.println();
        Car tata=new Car();
        tata.start();
    }
}
