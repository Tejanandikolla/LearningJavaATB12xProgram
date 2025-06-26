//21)  Find if a Person Can Travel Based on Visa Status and Age.
//     take the input from the user for
//            Age (integer).
//            Visa Status (String or boolean).
//     Check Eligibility:
//             :- If age is 18 or older and visa status is valid, the person can travel.
//Otherwise, the person cannot travel.
//        Validation Criteria
//                Age: - Must be a non-negative integer.
//                         :- Should be greater than or equal to 18 to be eligible to travel.
//        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
// :- You can also use a boolean where true indicates a valid visa and false indicates an invalid visa.
package Task20thjuneif_else;

import java.util.Scanner;

public class visa_validity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age and visa status as input in valid or invalid farm");
        int age = scanner.nextInt();
        String visa_status = scanner.next();
        while (age > 0) {
            if (age >= 18 && visa_status.equals("valid")) {
                System.out.println("The person can travel");

            } else {
                System.out.println("The person can't travel because of age or visa status mismatch");
            }
        }
        System.out.println("Invalid input:");
    }
}
