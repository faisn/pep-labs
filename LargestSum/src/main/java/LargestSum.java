
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
        // loop through the list 
        int current_largest_num = 0;
        int largest = 0;
        for (int i = 0; i < nums.size() ; i++) {
            current_largest_num = nums.get(i) + nums.get(i);
            
            if(current_largest_num > largest) {
                largest = current_largest_num;
            }
        }
       
        return largest ;
    }
}