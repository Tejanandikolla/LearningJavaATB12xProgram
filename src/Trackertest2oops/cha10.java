//Multiple Interface Implementation
//Create interfaces "Flyable" and "Swimmable" with appropriate methods. Implement both in a "Duck" class.
//Input:
//Create Duck object and call fly() and swim() methods
//Output:
//Duck is flying in the sky! Duck is swimming in the water!

package Trackertest2oops;
interface Flyable{
    void fly();


}
interface Swimmable{
     void swim();
}
class Duck implements Flyable,Swimmable{
    public void fly() {
        System.out.println("Duck is flying in the sky!");
    }
    public void swim(){
        System.out.println("Duck is swimming in the water!");
    }


}

public class cha10 {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        d.swim();

    }
}
