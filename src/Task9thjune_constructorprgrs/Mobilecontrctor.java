//5) Mobile Class with Constructor Overloading
//➤ Create a class Mobile
//       Use constructor overloading:
//First constructor → takes only brand
//Second constructor → takes brand and price
package Task9thjune_constructorprgrs;
class Mobile{
    String Brand;
    int price;
    Mobile(String brnd){
        Brand=brnd;
    }
    Mobile(String brand,int pr){
        this.Brand=brand;
        this.price=pr;
    }
    public void display(){
        System.out.println("Mobile Brand:"+Brand);
        System.out.println("Mobile price:"+price);

    }
}

public class Mobilecontrctor {
    public static void main(String[] args) {
        Mobile m=new Mobile("xiaomi");
        Mobile m1=new Mobile("samsung",100000);
        m.display();
        m1.display();

    }
}
