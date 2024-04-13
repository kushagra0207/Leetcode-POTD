85. Maximal Rectangle
Solved
Hard
Topics
Companies
Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.

class Solution {
    public int maximalRectangle(char[][] matrix) {
      int res = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int area = maxArea(matrix, i, j);
                res = Math.max(res, area);
            }
        }
        return res;
    }
    
// max area start with point(x,y)
    int maxArea(char[][] M, int x, int y) {
        int maxCol = M[0].length;  // every line ends here
        int res = 0;
        for (int i = x; i < M.length && M[i][y] != 0; i++) {
            for (int j = y; j < maxCol; j++) {
                if (M[i][j] == '0') {
                    maxCol = j;
                    break;
                }
                res = Math.max(res, (i - x + 1) * (j - y + 1));
            }
        }
        return res;  
    }
}
