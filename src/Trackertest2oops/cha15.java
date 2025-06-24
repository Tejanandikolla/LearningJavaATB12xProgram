//Custom Exception Implementation
//Create a custom exception class "InvalidAgeException" and throw it if age is less than 18.
//Input:
//validateAge(15) and validateAge(25)
//Output:
//InvalidAgeException: Age must be 18 or above. Provided age: 15 Age is valid: 25

package Trackertest2oops;

import javax.imageio.stream.ImageInputStream;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

 class AgeValidator {

     // Method to validate age
     public static void validateAge(int age) throws InvalidAgeException {
         if (age < 18) {
             throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
         } else {
             System.out.println("Age is valid: " + age);
         }
     }
     public class cha15 {
         public static void main(String[] args) {
             try {
                 validateAge(15); // Throws custom exception
             } catch (InvalidAgeException e) {
                 System.out.println("InvalidAgeException: " + e.getMessage());
             }

             try {
                 validateAge(25); // Valid age
             } catch (InvalidAgeException e) {
                 System.out.println("InvalidAgeException: " + e.getMessage());
             }
         }
     }
 }



