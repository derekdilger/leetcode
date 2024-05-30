public class Testing {
	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.numSteps("1011");
		System.out.println("reached bottom of main(String[] args)");
	}
}

class Solution {
	public int numSteps(String s) {
		int decimalNumber = binToDecimal(s);

		int stepsSoFar = 0;

		while (decimalNumber > 1) {
			System.out.println("at the top of while");
			if (decimalNumber == 1) {
				return stepsSoFar;
			}
			if ((decimalNumber % 2) == 0) {
				decimalNumber = decimalNumber/2;
				stepsSoFar += 1;
				System.out.println("decimal number is " + Integer.toString(decimalNumber));
			}
			if ((decimalNumber % 2) == 1 && decimalNumber > 1) {
				decimalNumber += 1;
				stepsSoFar += 1;
				System.out.println("decimal number is " + Integer.toString(decimalNumber));
			}
		}
		return stepsSoFar;
	}

	int binToDecimal(String binaryString) {
		/*
		int[] numsToSum = new int[binaryString.length()];
		int decimalSoFar = 0;
		for (int i = (binaryString.length()-1); i > -1; i--) {
			char charAtHand = binaryString.charAt(i);
			int intAtHand = Integer.parseInt(binaryString.);
			System.out.println(intAtHand + " is the intAtHand in binToDecimal");
			numsToSum[i] = (int)Math.pow(intAtHand, binaryString.length()-i);
		}
		int cumulativeTotal = 0;
		for (int j = 0; j < numsToSum.length; j++) {
			cumulativeTotal += numsToSum[j];
		}
		*/
		int decimalNumber = Integer.parseInt(binaryString, 2);


		return decimalNumber;
	}
}
