class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

		int totalSoFar = 0;
		for (int i = 0; i < nums.length; i++) {
			totalSoFar += nums[i];
			ans[i] = totalSoFar;
		}
		return ans;
    }
}
