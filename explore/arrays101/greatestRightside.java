class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        for (int w = 0; w < arr.length; w++) {
            if (w == arr.length - 1) {
                arr[w] = -1;
                return arr;
            } else {
                int highestSoFar = arr[w + 1];
                for (int r = w + 1; r < arr.length; r++) {
                    if (arr[r] > highestSoFar) {
                        highestSoFar = arr[r];
                    }
                }
                arr[w] = highestSoFar;
            }
        }
        return arr;
    }
}
