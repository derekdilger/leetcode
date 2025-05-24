import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappeared = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; ++i) {
            while (nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int j = 0; j < nums.length; ++j) {
            if (nums[j] != j + 1) {
                disappeared.add(j + 1);
            }
        }

        return disappeared;
    }
}

