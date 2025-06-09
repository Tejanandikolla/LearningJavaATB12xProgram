//Odd and Even Numbers from an Array
package Task1stjune;

public class evnoddarr {
    public static void main(String[] args) {
        int[] nums={2,3,4,5,6,7,8,9,10};
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i] %2==0){
                System.out.println(nums[i]+"--even");}
            else{
                System.out.println(nums[i]+"--odd");

            }
        }
    }
}
