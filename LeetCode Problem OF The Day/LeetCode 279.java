08-02-2024

279. Perfect Squares

Given an integer n, return the least number of perfect square numbers that sum to n.

A perfect square is an integer that is the square of an integer; in other words, it is the producy
 of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.



class Solution {
    public int numSquares(int n) {
        while(n%4 == 0)  n /= 4;
        if(n%8 == 7) return 4;
        for(int x=0; x*x <=n; x++){
            int y = (int)Math.sqrt(n - x*x);
            if(x*x + y*y == n){
                if(x == 0 || y == 0) return 1;
                else return 2;
            }
        }
        return 3;
    }
}