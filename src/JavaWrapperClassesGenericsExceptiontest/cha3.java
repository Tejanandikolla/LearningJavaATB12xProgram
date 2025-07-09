//Generic Swap Method
//Write a generic method to swap two elements in an array.
//
//Examples:
//Input:
//[1, 2, 3], swap indices 0 and 2
//Output:
//[3, 2, 1]
//Input:
//["A", "B", "C"], swap indices 0 and 1
//Output:
//["B", "A", "C"]
package JavaWrapperClassesGenericsExceptiontest;
import java.util.Arrays;
public class cha3 {
        // Generic swap method
        public static <T> void swap(T[] array, int i, int j) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void main(String[] args) {
            // Example 1: Integer array
            Integer[] intArray = {1, 2, 3};
            swap(intArray, 0, 2);
            System.out.println(Arrays.toString(intArray));  // Output: [3, 2, 1]

            // Example 2: String array
            String[] strArray = {"A", "B", "C"};
            swap(strArray, 0, 1);
            System.out.println(Arrays.toString(strArray));  // Output: [B, A, C]
        }
    }


