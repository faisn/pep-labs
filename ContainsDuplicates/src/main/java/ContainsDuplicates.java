import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javafx.beans.binding.SetBinding;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */

    public boolean containsDuplicate(int[] nums){
        boolean bool;
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums[i]; k++) {
                if (k == i) {
                    return true;
                }
            }
        }
        return false;
    }
}

