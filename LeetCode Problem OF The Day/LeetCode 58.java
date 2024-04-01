58. Length of Last Word
Solved
Easy
Topics
Companies
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

  

class Solution {
    public int lengthOfLastWord(String s) {
        int si = s.length();
        int right = si-1;

        while(right>=0 && s.charAt(right)==' '){
            right--;

        }
        if(s.charAt(right)==' '){
            right--;
        }
          int kg =0;
        while(right>=0 && s.charAt(right)!=' '){
            kg++;
            right--;
        }
        return kg;
        
    }
}
