//Task 5: Find Maximum
//Title: Find max using overloaded functions
//Description:
//Create a class Utility with two methods named max():
//max(int a, int b) returns the larger of two integers
//max(int a, int b, int c) returns the larger of three integers
//max(double a, double b) returns the larger of two decimal values
//Add method calls in main() to compare different types.

package Task10thjuly.MethodOverloading;


class Utility{
    void max(int a, int b){
        if(a>b){
            System.out.println("Max of given numbers is :"+a);
        }else{
            System.out.println("Max of given numbers is:"+b);
        }
    }
    void max(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a+"is the max number");
        } else if (b>a && b>c)  {
            System.out.println(b+"is the max number");

        }
        else {
            System.out.println(c+"is the max number");
        }
    }
}

public class Findmax {
    public static void main(String[] args) {
        Utility max=new Utility();
        max.max(4,8);
        max.max(2,4,10);
    }
}
