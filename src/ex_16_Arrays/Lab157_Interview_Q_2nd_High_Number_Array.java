package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int[] nums={12,24,56,34,845,234};
        Arrays.sort(nums);
        System.out.println(nums[nums.length-2]);
        System.out.println(nums[nums.length-3]);
        System.out.println(nums[nums.length-1]);
    }
}
