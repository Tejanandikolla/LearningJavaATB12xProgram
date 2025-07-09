//✅ Task 1: "Animal Sound Simulator"
//📄 Description:  (Single Inheritance + Method Call)
// Create a base class Animal with a method makeSound(). Then create a derived class Cat that has a method meow(). In the main method, call both methods using the Cat object.


package Task9thjuly_inheritence;

class Animal{
    void makeSound(){
        System.out.println("Animal make Sound");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("meow meow...");
    }
}

public class animalsound {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.makeSound();
    }
}
