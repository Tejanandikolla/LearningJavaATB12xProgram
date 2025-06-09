//Print the Smallest Element in an Array
package Task1stjune;

public class allsmlelm {
    public static void main(String[] args) {

        int[] nums = {22, 54, 34, 6, 82, 99,12};
        int min = nums[0];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (min > nums[i]) {
                min = nums[i];
            }


        }
        System.out.println(min);

    }
}
