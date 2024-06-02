class Solution {
    public void reverseString(char[] s) {
		for (int i = 0; i< s.length/2; i++) {
			char left = s[i];
			char right = s[s.length-1-i];
			s[i] = right;
			s[s.length-1-i] = left;
		}
    }
}



/*
input:
[A man a plan a canal: Panama]

output:
[amanaP :lanac  analp a nam A]...

expected:
[amanaP :lanac a nalp a nam A]...
*/
