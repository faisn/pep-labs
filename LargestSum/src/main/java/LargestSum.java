
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int so_far = 0;
        int largest = 0;
        for (int i = 0; i < nums.size(); i++) {
            so_far = so_far + i;
            so_far = Math.max(so_far, i);
            if (largest < so_far) {
                largest += so_far;
            }
            
            
        }
        return largest;
    }
}