//5) Check if a Person is Eligible to Vote (Age Check).
package Task19thjune_ifelse;

import java.util.Scanner;

public class votecheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of the person");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("Eligible for voting");
            } else {
                System.out.println(("Not eligible for voting"));
            }
        }
        else{
                System.out.println("Enter valid input");
            }
        }
    }

