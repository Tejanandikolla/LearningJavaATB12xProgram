//Task 2: "Vehicle Constructor Chain"
//📄 Description:
//Create a class Vehicle with a constructor that prints "Vehicle is ready".
//Create a class Bike that extends Vehicle and prints "Bike is ready" in its constructor. Create an object of Bike in the main method and observe constructor call order.

package Task9thjuly_inheritence;

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is ready");
    }

}
class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }
}

public class Vehicalconstrucot {
    public static void main(String[] args) {
        Bike b=new Bike();
    }
}
