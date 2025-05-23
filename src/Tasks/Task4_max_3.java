//Use the ternary operator, nested ternary operator. If we have three numbers, N1, N2, and N3, give me the maximum between the three numbers.

package Tasks;

public class Task4_max_3 {
    public static void main(String[] args) {

        int A = 30;
        int B = 20;
        int C = 10;
        String max = A > B && A > C ? "A is max" : B > A && B > C ? "B is max" : "C is max";
        System.out.println(max);
    }
}
