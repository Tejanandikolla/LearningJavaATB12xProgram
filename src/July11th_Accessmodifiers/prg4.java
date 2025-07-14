//Program 4: Create a Program to Access the private access modifier
package July11th_Accessmodifiers;

class Vehicle2{
    private int price=20000;
    private int discount=5000;

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }
    public void setPrice(int a){
       this.price=a;
    }

    public void setDiscount(int d) {
        this.discount = d;
    }
}

public class prg4 {
    public static void main(String[] args) {
        Vehicle2 v=new Vehicle2();
        System.out.println(v.getPrice());
        System.out.println(v.getDiscount());
        v.setPrice(300000);
        v.setDiscount(10000);
        System.out.println(v.getPrice());
        System.out.println(v.getDiscount());

    }
}
