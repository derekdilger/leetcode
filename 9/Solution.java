class Solution {
    public boolean isPalindrome(int x) {
        String numAsString = Integer.toString(x);
		int lengthOfString = numAsString.length();
		byte[] byteArrOfString = numAsString.getBytes();
		boolean palindromeSoFar = true;

		if ( x < 0) {
			return false;
		}
		if (lengthOfString%2 == 1) {
			
		}

		for (int i=0; i <= (byteArrOfString.length)/2; i++) {
			if (byteArrOfString[i] == byteArrOfString[byteArrOfString.length - i-1]) {
				continue;
			} else {
				return false;
			}
		}
		return palindromeSoFar;
    }
}
