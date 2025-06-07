package ex_15_StringBuffer_Builder_StringFunctions;

public class InterviewQ_Reverse_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
        String S1 = "Teja";

        for(int i=S1.length()-1;i>=0;i--){
            System.out.print(S1.charAt(i));
        }
        System.out.println("");

        StringBuffer sb = new StringBuffer(S1);
        System.out.println(sb.reverse());

    }
}
