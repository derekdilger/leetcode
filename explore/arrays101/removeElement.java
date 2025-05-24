class Solution {
    public int removeElement(int[] nums, int val) {
        int r = 0;
        int w = 0;
        if (nums.length == 0) return 0;
        while (r < nums.length) {
            if (nums[r] != val) {
                nums[w] = nums[r];
                ++w;
                ++r;
            } else {
                ++r;
            }
        }
        return w;
    }
}
