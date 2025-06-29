//Prime Number Finder
//Write a program to find and print all prime numbers between 1 and 100 using loops.
//
//**Requirements:**
//- Use nested loops to check for prime numbers
//- A prime number is divisible only by 1 and itself
//- Print all prime numbers in the range 1-100
//- Optimize the algorithm for better performance
//No input
//Output:
//Prime numbers between 1 and 100: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
package Trackertest;

public class cha15 {
    public static void main(String[] args) {
        System.out.print("Prime numbers between 1 and 100: ");

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;


            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

