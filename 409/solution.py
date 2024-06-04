class Solution:
    def longestPalindrome(self, s: str) -> int:
        letters_that_exist = set(s)
        dict_of_letters = {}

        for letter in letters_that_exist:
            dict_of_letters[letter] = s.count(letter)

        length_of_max_palindrome = 0
        haveSeenOdd = False 

        for i in dict_of_letters.keys():
            if dict_of_letters[i] % 2 == 0:
                length_of_max_palindrome += dict_of_letters[i]
            if dict_of_letters[i] % 2 == 1 and haveSeenOdd:
                length_of_max_palindrome += (dict_of_letters[i] -1)
            if dict_of_letters[i] % 2 == 1 and not haveSeenOdd:
                length_of_max_palindrome += dict_of_letters[i] 
                haveSeenOdd = True
        
        return length_of_max_palindrome
