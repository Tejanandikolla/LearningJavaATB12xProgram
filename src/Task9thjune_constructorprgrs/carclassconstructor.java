//2) Car Class Constructor
//➤ Define a Car class with brand, model, and price. Initialize using constructor and print car details.
package Task9thjune_constructorprgrs;
class Car{
    String brand;
    String model;
    int price;
    String color;
    Car(){
        System.out.println("dc");
    }
    Car(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    Car(String brand,String model,int price,String color){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.color=color;

    }
    public void car_details(){
        System.out.println("----Car Details----");
        System.out.println("Car Brand:"+this.brand);
        System.out.println("Car Model:"+this.model);
        System.out.println("Car price:"+this.price);
        System.out.println("Car color:"+this.color);
    }
}






public class carclassconstructor {
    public static void main(String[] args) {
        Car c1=new Car();
        Car c2=new Car("Tata","Altroz",700000);
        Car c3=new Car("Tata","Curve",1200000,"red");
        c1.car_details();
        c2.car_details();
        c3.car_details();
    }
}
