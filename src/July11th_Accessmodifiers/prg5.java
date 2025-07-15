//Program 5: default (no modifier) access - same package only
//📝 Instructions:
//Create a class Student with a method showDetails() without any access modifier (default).
//In the same file or same package, create a class TestDefault.
//In main(), create an object of Student and call the showDetails() method.

package July11th_Accessmodifiers;

class Student{
    void showDetails(){
        System.out.println("showing details of the student");
    }
}

class TestDefault{

}

public class prg5 {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.showDetails();
    }
}
