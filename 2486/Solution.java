class Solution {
    public int appendCharacters(String s, String t) {
		//MAX Number of chars to append is the length of t
		//init. int var starting at this MAX number
		//
		//assume string doesn't wrap back on itself
		//
		//start with first letter of t, find the earliest occurrence of 
		//(the first letter of t) in s. 
		//as soon as it's found, decrement MAX by one. Then load into memory 
		//the second letter of t, and search what remains of s. Do this until
		//you reach the end of s. return MAX.

		int maxNumChars = t.length();
		int indexOfCharWereLookingForIn_t = 0;
		for (int i = 0; i < s.length(); i++) {
			if ( maxNumChars > 0 && s.charAt(i) == t.charAt(indexOfCharWereLookingForIn_t) ) {
				indexOfCharWereLookingForIn_t += 1;
				maxNumChars -= 1;
			}
		}


		return maxNumChars;

    }
}
