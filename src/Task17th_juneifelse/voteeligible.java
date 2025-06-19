//5) Check if a Person is Eligible to Vote (Age Check).

package Task17th_juneifelse;

import java.util.Scanner;

public class voteeligible {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter  age of the person");

        if(scanner.hasNextInt()){
            int age =scanner.nextInt();
            if (age>=18) {
            System.out.println("Eligible to vote");}
            else {
                System.out.println("Not eligible to vote");
            }}
        else{
                System.out.println("Enter correct input");
            }



    }


}

