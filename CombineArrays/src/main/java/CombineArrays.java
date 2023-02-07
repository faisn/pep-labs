import java.util.ArrayList;
import java.util.Arrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        
        int a1 = arr1.length;
        int a2 = arr2.length;
        int a3 = a1 + a2;

        int[] arr3 = new int[a3];
        System.arraycopy(arr1, 0, arr3, 0, a1);
        System.arraycopy(arr2, 0, arr3, a1, a2);


        return arr3;
    }
}
