package Task25may;

public class ArmstrNumber {
    public static void main(String[] args) {
        int num=153;
        int originalNumber=num;
        int result=0;
        int l= String.valueOf(num).length();
        while(num!=0){
            int digit=num%10;
            int pow=1;
            for(int i=0;i<l;i++){
                 pow *= digit;
            }
            result += pow;
            num /= 10;

        }
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }


    }
}
