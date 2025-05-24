class Solution {
    public int heightChecker(int[] heights) {
        int[] origHeights = new int[heights.length];
        for (int j = 0; j < heights.length; ++j) {
            origHeights[j] = heights[j];
        }
        boolean hasSwapped = true;
        while (hasSwapped) {
            hasSwapped = false;
            for (int i = 0; i < heights.length - 1; ++i) {
                if (heights[i] > heights[i + 1]) {
                    int temp = heights[i];
                    heights[i] = heights[i + 1];
                    heights[i + 1] = temp;
                    hasSwapped = true;
                }
            }
        }
        int counter = 0;
        int numDiffSoFar = 0;
        while(counter < heights.length) {
            if (heights[counter] != origHeights[counter]) {
                ++numDiffSoFar;
            } 
            ++counter;
        }
        return numDiffSoFar;
    }
}
