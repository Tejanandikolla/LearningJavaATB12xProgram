//Program 7: Demonstrate public Access Modifier
//:- Understand how public methods are accessible from anywhere.
//📝 Instructions:
//Create a class Student with a public method showInfo() that prints "Public Access: Student Info".
//In the main() method, create an object of Student.
//Call showInfo() directly from anywhere like same class, sub class, different class same package, in different package it should work with
package July11th_Accessmodifiers;

class STudent{
    public void showInfo(){
        System.out.println("Public Access: Student Info");
    }

}

public class prg7 {
    public static void main(String[] args) {
        STudent s1=new STudent();
        s1.showInfo();
    }
}
