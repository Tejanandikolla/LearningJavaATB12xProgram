package Task31stmay;

public class countnoofwordsinastr {
    public static void main(String[] args) {
        String str = "   Hello My   name    is  teja   ";
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        String[] words= str.split(" ");
        int wordcount=words.length;
        System.out.println(wordcount);
    }
}
