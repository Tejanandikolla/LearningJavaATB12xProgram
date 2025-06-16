package Taskjune8;

public class oops {
    public static void main(String[] args) {
        Bus redbus=new Bus("teja",22,4,100);
        System.out.println(redbus.getSeatno());
        System.out.println(redbus.getName());

        redbus.details();
       //method overriding
        redbus.start();
        redbus.display();


    }
}
//base class
class Travel {
    //encapsulation
    private String name;
    private int seatno;

    public Travel(String name, int seatno) {
        this.name = name;
        this.seatno = seatno;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int  getSeatno(){
        return this.seatno;
    }
    public void setSeatno(int seatno){
        this.seatno=seatno;
    }
    public void start(){
        System.out.println("Bus  is starting");
    }
    public void display() {
        System.out.println("Name of the passenger:"+this.name);
        System.out.println("Seat Number:"+this.seatno);
    }

}
//derived class
//single inheritance
class Bus extends Travel{
    private int  mobileno;
    private int age;
    private int speed;

    public Bus(String name,int age,int seatno,int speed){
        super(name,seatno);//super key word for parent constructor
        this.age=age;//this key word
        this.speed=0;

    }
    public void details(){
        System.out.println("name of the passenger:"+getName()+" "+" Seatno:"+getSeatno()+"   "+"age of the passenger :"+this.age);
    }
    //method overload -- compile time polymorphism
    public void accelerate() {
        this.speed += 90;
        System.out.println("speed of the bus is:"+this.speed+"Km/hr");
    }
    public void accelerate(int change) {
        this.speed += change;
        System.out.println("speed of the bus is:" + this.speed + " km/h");
    }
    //method overriding --run time polymorphism
    @Override
    public void start(){
        super.start();
        System.out.println("red bus is started...");
    }
    @Override
    public void display(){
        super.display();//call parent method
        System.out.println("age of the passenger is:"+this.age);
    }

}