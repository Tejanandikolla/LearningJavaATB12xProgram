//Program 6: Demonstrate protected Access Modifier
//:-  Learn how protected members behave in inheritance.
//📝 Instructions:
//Create a class Animal with a protected method eat() that prints "Animal is eating".
//Create a child class Dog that extends Animal.
//Create a method doEat() in Dog class which calls eat() using inheritance.
//In main(), create a Dog object and call doEat().

package July11th_Accessmodifiers;

class Animal{
    protected void  eat(){
        System.out.println("Animals is eating");

    }
}
class Dog extends Animal{
    void doEat(){
        eat();
    }
}
public class prg6 {
    public static void main(String[] args) {
        Dog puppy=new Dog();
        puppy.doEat();

    }
}
