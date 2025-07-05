//Write a custom exception called `InvalidAgeException` and throw it if age is less than 18.
//
//Examples:
//Input:
//20
//Output:
//Valid age: 20

package JavaWrapperClassesGenericsExceptiontest;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class cha1 {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age: " + age);
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        int age = 2;

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
