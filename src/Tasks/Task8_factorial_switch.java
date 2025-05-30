package Tasks;

import java.util.Scanner;

public class Task8_factorial_switch {
    public static void main(String[] args) {
        System.out.println("enter a number for which you want factorial:");
        Scanner numb = new Scanner(System.in);
        if (numb.hasNextInt()) {
            int num = numb.nextInt();
            int fact = 1;
            for (int i = 1; i <=num; i++) {
                fact = fact* i;


            }
            System.out.println("factorial is " + fact);

        }
    }
}

