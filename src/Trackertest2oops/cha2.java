//Student Management System
//Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.
//Create student with name="Bob", rollNo=101, section="A"
//Output:
//Student: Bob, Roll No: 101, Section: A
package Trackertest2oops;

class Student{
    String name;
    int rollno;
    char sec;
    public Student (){
        name="Bob";
        rollno=101;
        sec='A';

    }
    public void display(){
        System.out.println("Student:"+name+","+" Roll No:"+rollno+","+" Section"+sec);
    }

}





public class cha2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();

    }
}
