import java.lang.Math;
import java.math.BigInteger;

public class Driver {
	public static void main(String[] args) {
		long input = 2;
		System.out.println("input = " + Long.toString(input));

		Solution sol = new Solution();
		long toSeeAns = sol.checkRecord((int)input);

		String strAns = Long.toString(toSeeAns);
		System.out.println(strAns);
	}
}

class Solution {
    public int checkRecord(int n) {
		long longN = (long) n;
		//n = (long)n;
        long numWithoutA = (long)Math.pow(2, longN); 
		System.out.println("numWithoutA = " + Long.toString(numWithoutA));
		long numIneligibleWithoutA = l(longN); 
		System.out.println("numIneligibleWithoutA = " + Long.toString(numIneligibleWithoutA));

		long numWithA = longN*((long)Math.pow(longN, longN-1));
		System.out.println("numWithA = " + Long.toString(numWithA));
		long numIneligibleWithA = numIneligibleWithA_func(longN);
		System.out.println("numIneligibleWithA = " + Long.toString(numIneligibleWithA));

		long almostAns = (numWithoutA + numWithA) -
			(numIneligibleWithoutA + numIneligibleWithA);

		long ans = almostAns % ((long)Math.pow(10, 9) + 7);
		return (int)ans;
    } // checkRecord(long n)

	long l(long h) {

		if (h==0 || h==1 || h==2) {
			return 0;
		}
		else {
			return (h-2)*((long)Math.pow(2, h-3));
		}

	} // l(long h)

	long numIneligibleWithA_func(long n) {
		long ineligibleSoFar = 0;

		if (n==0 || n==1 || n==2 || n==3) {
			return 0;

		} else {
			for (int i = 0; i<n; i++) {
				ineligibleSoFar += ( l(i) + l(n-i) );
			}
		}

		return ineligibleSoFar;
	} //numIneligibleWithA_func(long n)
}
