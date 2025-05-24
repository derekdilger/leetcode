class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean hasAscended = false;
        boolean hasDescended = false;
        boolean hasPeaked = false;
        int i = 1;

        if (arr.length < 3){
            return false;
        }
        if (arr[0] < arr[1]) {
            hasAscended = true;
        } else {
            return false;
        }
        //go to top
        while (i < arr.length) {
            if (arr[i] > arr[i - 1] && hasPeaked == false) {
                i++;
                continue;
            }
            if (arr[i] == arr[i - 1]) {
                return false;
            }
            else if (arr[i] < arr[i - 1]) {
                i++;
                hasPeaked = true;
                hasDescended = true;
                break;
            }
        }
        //go to bottom
        while (i < arr.length) {
            if (arr[i] < arr[i - 1]) {
                i++;
                continue;
            } else {
                return false;
            }
        }
        return hasAscended && hasDescended && hasPeaked;
    }
}
