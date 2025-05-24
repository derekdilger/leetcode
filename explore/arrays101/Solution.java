class Solution {
    public int findNumbers(int[] nums) {
        int numEvenSoFar = 0;

        for (int intAtHand : nums) {
            String intAsStr = Integer.toString(intAtHand);
            if ( (intAsStr.length()) % 2 == 0) {
                numEvenSoFar++;
            }
        }
        return numEvenSoFar;
    }
}
