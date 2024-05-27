import java.util.Arrays;

//below is my first attempt, O(n^2)
class Solution {
    public int[] twoSum(int[] nums, int target) {
	outerloop:
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j) {
					continue;
				}
				if (nums[i] + nums[j] == target) {
					int[] ans = new int[2];
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}
		return nums; 
    }
}
