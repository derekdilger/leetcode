class Solution {
    public void duplicateZeros(int[] arr) {
        int index = 0;

        if (arr.length == 2 && arr[0] == 0) {
            arr[1] = 0;
        }

        while (index < arr.length) {
            if (arr[index] == 0) {
                //we encountered a 0, need to duplicate 0, & move remaining
                //elements to the right by one
                int j = arr.length - 2;
                while(j > index) {
                    arr[j+1] = arr[j];
                    j--;
                }
                //arr[j] = 0;
                arr[j+1] = 0;
                index++;
            } 
            index++;
        }
    }
}
