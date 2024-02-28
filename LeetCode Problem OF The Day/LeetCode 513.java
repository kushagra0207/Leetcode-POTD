28-02-2024

  513. Find Bottom Left Tree Value
Solved
Medium
Topics
Companies
Given the root of a binary tree, return the leftmost value in the last row of the tree.

 

Example 1:


Input: root = [2,1,3]



class Solution {
    private int maxDepth;
    private int bottomLeftValue;

    public int findBottomLeftValue(TreeNode root) {
        maxDepth = -1;
        bottomLeftValue = 0;
        dfs(root, 0);
        return bottomLeftValue;
    }

    private void dfs(TreeNode current, int depth) {
        if (current == null) {
            return;
        }
        if (depth > maxDepth) {  // If true, we discovered a new level
            maxDepth = depth;
            bottomLeftValue = current.val;
        }
        dfs(current.left, depth + 1);
        dfs(current.right, depth + 1);
    }
}
