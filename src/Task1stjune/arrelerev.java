//Elements of an Array in Reverse Order.

package Task1stjune;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrelerev {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(nums));

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
        }
    }
}
