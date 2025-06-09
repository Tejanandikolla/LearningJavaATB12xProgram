package Task31stmay;

public class firstltrineachword {
    public static void main(String[] args) {
        String str = "  Hello  this  is  teja  ";
        str = str.trim();
        str = str.replaceAll("\\s", " ");
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0) + " ");

            }
        }
    }
}
