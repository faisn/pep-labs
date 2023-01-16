
import java.util.Collections;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        Collections.sort(nums);
        int max = 0;
        int min = 0;
        int differenceBtwnMinAndMax = 0;
        System.out.println(nums);
        for (int i = 0; i < nums.size(); i++) {
            max = nums.get(i);
            min = nums.get(0);
            differenceBtwnMinAndMax = max - min;
        }
        System.out.println(differenceBtwnMinAndMax);
        return differenceBtwnMinAndMax;
    }
}
