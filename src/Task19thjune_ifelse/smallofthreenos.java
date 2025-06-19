//8) Find the Smallest of Three Numbers.
package Task19thjune_ifelse;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class smallofthreenos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println(("Enter 3 numbers to know the smallest one"));
        int n1=scanner.nextInt();
        int n2= scanner.nextInt();
        int n3= scanner.nextInt();
        if(n1<n2 && n1<n3){
            System.out.println(n1+"--is the smallest one");
        }
        else if(n2<n1 &&n2<n3){
            System.out.println(n2+"--is the smallest one");
        }
        else{
            System.out.println(n3+"--is the smallest one");
        }
    }
}
