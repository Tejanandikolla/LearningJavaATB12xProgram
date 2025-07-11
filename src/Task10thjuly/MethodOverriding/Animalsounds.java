//🔹 Task 1: Animal Sounds
//Title: Override sound behavior in subclasses
//Description:
//Create a base class Animal with a method sound().
//Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
//Create an object of each class and call sound() to see how overriding provides different outputs using the same method name.
package Task10thjuly.MethodOverriding;

import ex_17_OOPs.D;

class Animal{
    void sound(){
        System.out.println("Animals make sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Bark.....");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow meow....");
    }
}
class Cow extends Animal{
    void sound(){
        System.out.println("Moo");
    }
}

public class Animalsounds {
    public static void main(String[] args) {
        Animal a=new Animal();
        Dog puppy=new Dog();
        Cat kitten=new Cat();
        Cow calf=new Cow();
        a.sound();
        puppy.sound();
        kitten.sound();
        calf.sound();
    }
}
