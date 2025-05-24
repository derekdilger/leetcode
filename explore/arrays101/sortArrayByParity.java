class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenReceiverPtr = 0;
        int readerPtr = 0;
        while (readerPtr < nums.length) {
            if (nums[readerPtr] % 2 == 0) {
                int temp = 0;
                temp = nums[evenReceiverPtr];
                nums[evenReceiverPtr] = nums[readerPtr];
                nums[readerPtr] = temp;
                ++evenReceiverPtr;
            }
            ++readerPtr;
        }
        return nums;
    }
}
