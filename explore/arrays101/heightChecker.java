import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int k = 0;
        int numOutOfOrder = 0;
        while (k < heights.length) {
            if (heights[k] != sorted[k]) {
                ++numOutOfOrder;
            }
            ++k;
        }
        return numOutOfOrder;
    }
}
