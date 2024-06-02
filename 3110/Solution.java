class Solution {
    public int scoreOfString(String s) {
        int scoreSoFar = 0;
		for (int i = 0; i < s.length()-1; i++) {
			char char1 = s.charAt(i);
			char char2 = s.charAt(i+1);
			scoreSoFar += Math.abs(java.lang.Character.getNumericValue(char1) - java.lang.Character.getNumericValue(char2));
		}
		return scoreSoFar;
    }
}
