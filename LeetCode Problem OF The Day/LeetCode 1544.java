1544. Make The String Great
Solved
Easy
Topics
Companies
Hint
Given a string s of lower and upper case English letters.

A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.

Return the string after making it good. The answer is guaranteed to be unique under the given constraints.

Notice that an empty string is also good.


  class Solution {
    public String makeGood(String s) {
         var sb = new StringBuilder();
    for (int i = 0; i < s.length(); ++i) {
      int l = sb.length();
      if (l > 0 && Math.abs(sb.charAt(l - 1) - s.charAt(i)) == 32) {
        sb.setLength(l - 1); // remove last char
      } else {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
    }
}
