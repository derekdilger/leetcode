class Solution {
    public boolean validMountainArray(int[] arr) {
        int peakIndex = -1;
        int prevElevation = -1;

        if (arr.length < 3) {
            return false;
        } 
        for (int curIndex = 0; curIndex < arr.length; curIndex++) {
            if (prevElevation == -1) {
                prevElevation = arr[curIndex];
                continue;
            } 
            if (arr[curIndex] > prevElevation && peakIndex == -1) {
                prevElevation = arr[curIndex];
                continue;
            } else if (arr[curIndex] < prevElevation && peakIndex == -1) {
                peakIndex = arr[curIndex - 1];
                prevElevation = arr[curIndex];
                continue;
            } 
            if (arr[curIndex] < prevElevation) {
                prevElevation = arr[curIndex];
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
