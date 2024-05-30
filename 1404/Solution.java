class Solution {
    public int numSteps(String s) {
        int stepsSoFar = 0;
		boolean isDone = false;

		while (!isDone) {
			char[] charArr = s.toCharArray();

			if (s.indexOf(49) == s.length()-1) {
				isDone = true;
				return stepsSoFar;
			}

			if (charArr[0] == 48) { //if first character is 0
				s = valueOf(charArr[1], 1, 1); //remove leading 0
			}
			if (charArr[charArr.length-1] == 1) {

			}
		}
    }
}
