//Program 3: Access parent class variable using super

package July11th_Accessmodifiers;

class Students{
    int rollno=1;
    String name="niha";
    Students(){
        System.out.println("dc");
    }
}
class Student1 extends Students{
    Student1(){
        String name="surya";
        int rollno=2;
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(super.name);
        System.out.println(super.rollno);

    }
}



public class prg3 {
    public static void main(String[] args) {
        Student1 s1=new Student1();

    }
}
