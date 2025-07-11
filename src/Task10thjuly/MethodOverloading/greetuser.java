//🔹 Task 4: Greet User
//Title: Greet users differently using overloading
//Description:
//Create a class Greeter with the following methods:
//greet() – prints "Hello!"
//greet(String name) – prints "Hello, [name]!"
//This task teaches overloading based on the number of parameters.
package Task10thjuly.MethodOverloading;

class Greeter{
    void greet(){
        System.out.println("Hello!");
    }
    void greet(String name){
        System.out.println("Hello,"+"["+name+"]"+"!");
    }
}

public class greetuser {
    public static void main(String[] args) {
        Greeter greeting =new Greeter();
        greeting.greet();
        greeting.greet("teja");
    }
}
