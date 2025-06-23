//Employee Encapsulation
//Implement encapsulation in a class "Employee" with private attributes "id", "name", and "salary". Add getter and setter methods.
//Input:
//Employee with id=1, name="John Doe", salary=50000
//Output:
//Employee ID: 1 Employee Name: John Doe Employee Salary: 50000.0
package Trackertest2oops;

class Employee{
    private int id;
    private String name;
    private  int salary;

    public Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void display(){
        System.out.println("Employee ID:"+this.id+" Employee Name: "+this.name+" Employee Salary:"+this.salary);
    }
}

public class cha3 {
    public static void main(String[] args) {
        Employee E1= new Employee(1,"John Doe",50000);
        E1.display();

    }
}
