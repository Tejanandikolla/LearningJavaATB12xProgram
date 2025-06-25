//7. Calculate the sum of numbers from 1 to 100

package Task24junefor_whileloop;

public class sum1_100 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=100;i++){
            sum +=i;
        }
        System.out.println("Sum of numbers from 1 to 100:"+sum);
    }
}
