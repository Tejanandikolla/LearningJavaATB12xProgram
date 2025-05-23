package Tasks;

public class Task6_triangle {
    public static void main(String[] args) {
//        System.out.println("enter sides of trangle");
//        Scanner s1 = new Scanner(System.in);
//        Scanner s2 = new Scanner(System.in);
//        Scanner s3 = new Scanner(System.in);
        int s1 = 4, s2 = 5, s3 = 3;
        if (s1 == s2 && s1 == s3) {

            System.out.println("equilateral");

        } else if (s1 == s2 || s1 == s3||s2==s3) {

            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}

