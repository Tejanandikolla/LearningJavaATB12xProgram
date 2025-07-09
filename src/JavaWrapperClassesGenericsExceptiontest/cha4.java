//Catch Multiple Exceptions
//Write a program that catches both `ArithmeticException` and `ArrayIndexOutOfBoundsException`.
//
//Examples:
//Input:
//Division by zero in array operation
//Output:
//Exception caught: ArithmeticException or ArrayIndexOutOfBoundsException

package JavaWrapperClassesGenericsExceptiontest;

public class cha4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int index = 5;  // Invalid index
        int divisor = 0; // Division by zero

        try {
            int result = numbers[index] / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        }
    }
}
