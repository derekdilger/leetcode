package 552;
import java.lang.Math;

class Solution {
    public int checkRecord(int n) {
        int numWithoutA = (int)Math.pow(2, n);
		int numIneligibleWithoutA = l(n);

		int numWithA = n*((int)Math.pow(n, n-1));
		int numIneligibleWithA = numIneligibleWithA_func(n);

		int almostAns = (numWithoutA + numWithA) -
			(numIneligibleWithoutA + numIneligibleWithA);

		int ans = almostAns % ((int)Math.pow(10, 9) + 7);
		return ans;
    }

	int l(int h) {
		int localvar = 0;

		if (h==0 || h==1 || h==2) {
			return 0;
		}
		else {
			return (h-2)*((int)Math.pow(2, h-3));
		}

	}

	int numIneligibleWithA_func(int n) {
		int ineligibleSoFar = 0;

		for (int i = 0; i<n; i++) {
			ineligibleSoFar += ( l(i) + l(n-i) );
		}
		return ineligibleSoFar;
	}
}
