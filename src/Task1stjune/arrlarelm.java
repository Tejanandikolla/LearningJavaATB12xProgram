//Print the Largest Element in an Array.
package Task1stjune;

public class arrlarelm {
    public static void main(String[] args) {
        int[] nums ={22,54,34,674,82,99};
        int max=nums[0];
        for(int i= nums.length-1;i>=0;i--){
            if(max<nums[i]){
                max =nums[i];
            }


        }System.out.println(max);

    }
}
