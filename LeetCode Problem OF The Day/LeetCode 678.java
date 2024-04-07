678. Valid Parenthesis String
Solved
Medium
Topics
Companies
Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.

The following rules define a valid string:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".



  class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;
        for (char c : s.toCharArray()) {
            low += (c == '(') ? 1 : -1;
            high += (c != ')') ? 1 : -1;
            if (high < 0) return false;
            low = Math.max(low, 0);
        }
        return low == 0;
    }
}
