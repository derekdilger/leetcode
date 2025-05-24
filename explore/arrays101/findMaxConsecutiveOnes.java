class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnesSoFar = 0;
        int prevIslandSize = 0;
        int biggestPotentialSoFar = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                ++consecutiveOnesSoFar;
            } else {
                prevIslandSize = consecutiveOnesSoFar + 1;
                consecutiveOnesSoFar = 0;
            }
            if (consecutiveOnesSoFar + prevIslandSize > biggestPotentialSoFar)
            {
                biggestPotentialSoFar = consecutiveOnesSoFar + prevIslandSize;
            }
        }
        return biggestPotentialSoFar;
    }
}
