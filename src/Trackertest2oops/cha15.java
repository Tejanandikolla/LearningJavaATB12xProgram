//Custom Exception Implementation
//Create a custom exception class "InvalidAgeException" and throw it if age is less than 18.
//Input:
//validateAge(15) and validateAge(25)
//Output:
//InvalidAgeException: Age must be 18 or above. Provided age: 15 Age is valid: 25

//package Trackertest2oops;
//class InvalidAgeException extends Exception {
//    InvalidAgeException(String msg) {
//        super(msg);
//    }
//}
//
//
//public class cha15 {
//    public static void main(String[] args) {
//
//
//            // Method to check age
//            public static void validateAge(int age) throws InvalidAgeException {
//                if (age < 18) {
//                    throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
//                } else {
//                    System.out.println("Age is valid: " + age);
//                }
//            try {
//                validateAge(15); // This will throw exception
//            } catch (InvalidAgeException e) {
//                System.out.println("InvalidAgeException: " + e.getMessage());
//            }
//
//            try {
//                validateAge(25); // This will print valid age
//            } catch (InvalidAgeException e) {
//                System.out.println("InvalidAgeException: " + e.getMessage());
//            }
//        }
//    }
//            }

//    }
//}
