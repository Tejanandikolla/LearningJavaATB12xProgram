package Task20thjuneif_else;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sides of a triangle");
        int s1=scanner.nextInt();
        int s2=scanner.nextInt();
        int s3=scanner.nextInt();
        if(s1==s2 && s1==s3){
            System.out.println("It is a valid triangle");}
        else{
            System.out.println(("It is not a valid triangle"));
        }

    }
}
