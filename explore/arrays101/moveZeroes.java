class Solution {
    public void moveZeroes(int[] nums) {
        int r = 0;
        int w = 0;

        while (r < nums.length) {
            if (nums[r] != 0) {
                nums[w] = nums[r];
                ++w;
                ++r;
            }
            else {
                ++r;
                continue;
            }
        }
        while (w < nums.length) {
            nums[w] = 0;
            w++;
        }
    }
}
