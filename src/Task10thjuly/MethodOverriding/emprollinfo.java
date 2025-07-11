// Task 3: Employee Role Info
//Title: Show employee roles with overridden methods
//Description:
//Create a class Employee with method role() printing “General Employee”.
//Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
//Call role() on each object to show how overriding helps in specialization.

package Task10thjuly.MethodOverriding;

class Employee{
    Employee(){
        System.out.println("DC");
    }
    public void role(){
        System.out.println("General Employee");
        System.out.println();
    }
}
class Manager {
    public void role(){
        System.out.println("Working as a Manager");
        System.out.println();
    }
}
class Clerk extends Employee{
    public void role(){
        System.out.println("Working as a Clerk");
        System.out.println();
    }
}
class Tester extends Employee{
    public void role(){
        System.out.println("Working as a Tester");
        System.out.println();
    }
}

public class emprollinfo {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.role();
        Manager m=new Manager();
        m.role();
        Clerk c=new Clerk();
        c.role();
        Tester t=new Tester();
        t.role();
    }
}
