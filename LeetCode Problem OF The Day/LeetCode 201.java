21-02-2024

201. Bitwise AND of Numbers Range
Solved

Companies
Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.


  Java Code with TC - O(logN) and SC - O(1)


  class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);
    }
}




  
