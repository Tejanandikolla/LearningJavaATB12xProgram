//Task 2: Print Data
//Title: Create a universal printer with overloading
//Description:
//Create a class Printer with multiple printData() methods to handle different data types:
//printData(String data)
//printData(int data)
//printData(float data)
//Demonstrate in the main() method how the same method name behaves differently depending on the parameter type.
package Task10thjuly.MethodOverloading;
class Printer{
    Printer(){
        System.out.println("dc");
    }
    public void printdata(Integer a){
        System.out.println("Prints integer data----"+a);
    }
    public void printdata(String name){
        System.out.println("Prints String data----"+name);
    }
    public void printdata(Double a){
        System.out.println("Prints Double data---"+a);
    }
    public void printdata(Boolean a){
        System.out.println("Prints boolean data---"+a);
    }

}

public class Printdata {
    public static void main(String[] args) {
        Printer p=new Printer();
        p.printdata(2);
        p.printdata(2.3);
        p.printdata("teja");
        p.printdata(true);

    }
}
