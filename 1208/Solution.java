class Solution {
	public int equalSubstring(String s, String t, int maxCost) {
		int maxLengthSoFar = 0; //length of longest substring yet found
		outerLoop:
		for (int hardLeftOfWindow=0; hardLeftOfWindow<s.length(); hardLeftOfWindow++) {//j is starting position of substring
			int costSoFar = 0; //running total of cost to make substring
			int lengthSoFar = 0; //length of current substring
			for (int slidingRightOfWindow=hardLeftOfWindow; slidingRightOfWindow<s.length(); slidingRightOfWindow++) {//i is how far we've moved from j
				int diff = diffInIthCharValues(slidingRightOfWindow, s, t);
				if ((costSoFar+diff) <= maxCost) {//if we can afford it
					costSoFar += diff; //pay the price
					lengthSoFar += 1; //and gain length of the subString
					if (lengthSoFar > maxLengthSoFar) { //if this is a record long length
						maxLengthSoFar = lengthSoFar; //update our records
					}
				} else {
					continue outerLoop;
				}
			}
			return maxLengthSoFar;
		}
		return maxLengthSoFar;
	}

	int diffInIthCharValues(int I, String str1, String str2) {
		char char1 = str1.charAt(I);
		char char2 = str2.charAt(I);
		int valChar1 = char1;
		int valChar2 = char2;

		int diff = (valChar1 - valChar2);
		if(diff >= 0) {
			return diff;
		} else {
			return ((-1) * diff);
		}
		//return -100000000;
	}
}
