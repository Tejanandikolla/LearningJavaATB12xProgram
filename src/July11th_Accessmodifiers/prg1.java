//Program 1: Access parent class constructor using super()
package July11th_Accessmodifiers;

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle starting");
    }
}
class Car extends Vehicle{
    Car(){
        super();
        System.out.println("Car starting...");
    }
}


public class prg1 {
    public static void main(String[] args) {
        Car c=new Car();
    }
}
