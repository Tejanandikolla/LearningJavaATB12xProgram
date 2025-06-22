//Person Class Implementation
//Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
//Input:
//Create Person objects with names "John" (25) and "Alice" (30)
//Output:
//Name: John, Age: 25 Name: Alice, Age: 30
package Trackertest2oops;


class Person{
    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;

        }
        public void display(){
            System.out.println("Name:"+this.name+"Age:"+this.age);
        }

    }


public class cha1 {
    public static void main(String[] args) {
        Person p1=new Person( "John", (25));
        Person p2=new Person("Alice" ,(30));
        p1.display();
        p2.display();



    }

}
