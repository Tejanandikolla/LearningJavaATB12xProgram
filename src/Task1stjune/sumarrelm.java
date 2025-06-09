//Sum of All Items of the Array
package Task1stjune;

public class sumarrelm {
    public static void main(String[] args) {
        int sum=0;
        int[] nums={1,2,3,4,5};
        for(int i= nums.length -1;i>=0;i--){
            sum = sum+nums[i];
        }
        System.out.println(sum);
    }
}
