//Animal Sound Polymorphism
//Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.
//Input:
//Create Dog and Cat objects and call makeSound()
//Output:
//Dog says: Woof! Woof! Cat says: Meow! Meow!

package Trackertest2oops;
class Animal{
    public void makesound(){
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal{
    public void makesound(){
        System.out.println("Dog says: Woof! Woof!");
    }

        }
class Cat extends Animal{
    public void makesound(){
        System.out.println("Cat says: Meow! Meow!");
    }
}

public class cha5 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.makesound();
        c.makesound();

    }
}
