//25)  Find if a Person is Senior Citizen Based on Age.
//         :- take the age input from the user.
//        Implement Age Category Logic:
//Define the criteria for different age categories:
//Child: Age 0 to 12
//Teenager: Age 13 to 19
//Adult: Age 20 to 64
//Senior Citizen: Age 65 and older
package Task23thjunif_else;

import java.util.Scanner;

public class seniorcitizenornot {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter age :");
        int age=scanner.nextInt();
        if (age >0 && age<=12){
            System.out.println("Your age "+"is "+age+" you are a child ");
        }
        else if (age>=13 && age<=19){
            System.out.println("Your age "+"is "+age+"you are a Teenager ");
        }
        else if(age>=20 && age<=64){
            System.out.println("Your age "+"is "+age+"you are an adult ");
        }
        else{
            System.out.println("Your age "+"is "+age+"you are a Senior citizen ");
        }
    }
}
