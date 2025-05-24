class Solution {
    public void sortColors(int[] nums) {
        //using selection sort here even though maybe there's a better way
        //cuz the explore card was yappin about it so. i should use it.
        int temp = 0;

        for (int w = 0; w < nums.length; ++w) {
            int indexOfLowestSoFar = nums.length - 1;
            for (int r = w; r < nums.length; r++) {
                if (nums[r] < nums[indexOfLowestSoFar]) {
                    indexOfLowestSoFar = r;
                }
            }
            temp = nums[w];
            nums[w] = nums[indexOfLowestSoFar];
            nums[indexOfLowestSoFar] = temp;
        }
    }
}
