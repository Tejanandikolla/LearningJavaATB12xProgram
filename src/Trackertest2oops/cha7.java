//Employee Hierarchy with Salary Calculation
//Create an Employee base class and Manager, Developer subclasses. Each should have different salary calculation methods.
//Input:
//Manager with base salary 60000 and bonus 10000, Developer with hourly rate 50 and 160 hours
//Output:
//Manager Salary: 70000.0 Developer Salary: 8000.0
package Trackertest2oops;

class Employeee{

    }

class Manager extends Employeee {
    void salary() {
        double basesalary = 60000;
        double bonus = 10000;
        System.out.println("Manager Salary:"+(basesalary+bonus));

    }
}
class Devloper extends Employeee{
    void salary(){
        double hr=160;
        double rate=50;
        double sal=hr*rate;

        System.out.println("Developer Salary:"+sal);
    }
}
public class cha7 {
    public static void main(String[] args) {
        Manager m=new Manager();
        Devloper d=new Devloper();
        m.salary();
        d.salary();

    }
}
