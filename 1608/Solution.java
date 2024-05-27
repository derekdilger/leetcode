import java.util.Arrays;

class Solution {
    public int specialArray(int[] nums) {
		java.util.Arrays.sort(nums);
        int X = -1; 
		int numElemsGEtoX;
		
		if (nums[0] >= nums.length) { 
			// if every number in array is GE the length of array
			// then it's special and X == length of array
			return nums.length;
		}

		if (nums[nums.length -1] == 0) {
			//never special if biggest element is 0
			return -1;
		}

		for (int x=0; x<100; x++) { //every possible x value
			int runningTotal=0;
			for (int i=0; i<nums.length; i++) {

				if (nums[i] >= x) {
					runningTotal += 1;
				}

			}

			if (runningTotal == x) {
				return runningTotal;
			}

		}
		
		
		return X;
    }
}
