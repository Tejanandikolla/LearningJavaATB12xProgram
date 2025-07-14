//Program 2: Access parent class method using super
package July11th_Accessmodifiers;

class Vehicle1{
    Vehicle1(){
        System.out.println("dc");
    }
    public void start(){
        System.out.println("vehicle started");
    }
}
class Bike extends Vehicle1{
    Bike(){
        super.start();

        System.out.println("dc");
    }

    public void start(){
        //super.start();

        System.out.println("Bike started");
    }
}
public class prg2 {
    public static void main(String[] args) {
        Bike tvs=new Bike();
        tvs.start();
    }
}
