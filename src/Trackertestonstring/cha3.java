//StringBuilder vs StringBuffer Performance
//Write a program that demonstrates the performance difference between String concatenation, StringBuilder, and StringBuffer for multiple string operations.
//
//Examples:
//Input:
//1000 iterations
//Output:
//String: 150ms, StringBuilder: 5ms, StringBuffer: 8ms

package Trackertestonstring;

public class cha3 {
    public static void main(String[] args) {
        int iterations = 100000;

        // Test using String (immutable)
        long starttime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String: " + (endTime - starttime) + " ms");

        // Test using StringBuilder (non-synchronized, faster)
        starttime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (endTime - starttime) + " ms");

        // Test using StringBuffer (synchronized, thread-safe)
        starttime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (endTime - starttime) + " ms");
    }
}

