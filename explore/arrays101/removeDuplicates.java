class Solution {
    public int removeDuplicates(int[] nums) {
        int w = 1; //w for writer
        
        if (nums.length == 1) {
            return 1;
        }
        for (int r = 1; r < nums.length; ++r) { //r for reader
            if (nums[r] > nums[r-1]) {
                nums[w] = nums[r];
                w++;
            } 
        }
        return w;
    }
}
