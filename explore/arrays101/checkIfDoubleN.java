class Solution {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 0) {
            return false;
        }
        //looking for twice the number at hand
        for (int r = 0; r < arr.length; r++) {
            int lookingFor = arr[r] * 2;
            for (int i = r + 1; i < arr.length; i++) {
                if (arr[i] == lookingFor) {
                    return true;
                }
            }
        }
        //looking for half the number at hand; but only if number is even
        for (int h = 0; h < arr.length; h++) {
            if (arr[h] % 2 == 0) {
                int lookingFor = arr[h] / 2;
                for (int i = h + 1; i < arr.length; i++) {
                    if (arr[i] == lookingFor) {
                        return true;
                    }
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
