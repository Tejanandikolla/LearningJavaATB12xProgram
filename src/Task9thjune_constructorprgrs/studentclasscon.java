//1) Student Class Constructor
//➤ Create a class Student with a constructor to initialize name and age. Print both using a display method.

package Task9thjune_constructorprgrs;

class Student{
    String name;
    int age;
    Student(){
        System.out.println("Dc");
        this.name="teja";
        this.age=20;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name of the student is:"+this.name);
        System.out.println("Age:"+this.age);
    }
}

public class studentclasscon {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("niha",6);
        Student s3=new Student("manu",20);
        s1.display();
        s2.display();
        s3.display();

    }
}
