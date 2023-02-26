
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
        int currentSum = 0;
        int maxSum = 0;
        for(int i=0; i < nums.size(); i++){
			currentSum = Math.max(nums.get(i), currentSum + nums.get(i));
			maxSum = Math.max(currentSum, maxSum);
		}
            
        return maxSum;
    }
}