//Multi-Exception Handling
//Implement exception handling for a program that divides two numbers and catches ArithmeticException, NumberFormatException, and ArrayIndexOutOfBoundsException.
//Input:
//Division by zero, invalid number format, array index out of bounds
//Output:
//ArithmeticException: Cannot divide by zero NumberFormatException: Invalid number format ArrayIndexOutOfBoundsException: Array index out of bounds

package Trackertest2oops;

public class cha14 {
    public static void main(String[] args) {
        try{
//            int a=10;
//            int b=0;
//            int res=a / b;

            String str="abc";
            int num=Integer.parseInt(str);

            int[] arr={1,2,3};
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException: Cannot divide by zero");}
        catch (NumberFormatException e){
            System.out.println("NumberFormatException: Invalid number format");}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");}

            }

        }



