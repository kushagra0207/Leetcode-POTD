27-02-2024

  543. Diameter of Binary Tree
Solved
Easy
Topics
Companies
Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.


  class Solution {
    public class DiameterData {
        int diameter;
        int height;
        DiameterData(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public DiameterData calculateDiameterAndHeight(TreeNode root) {
        if (root == null) {
            return new DiameterData(0, 0);
        }

        DiameterData leftData = calculateDiameterAndHeight(root.left);
        DiameterData rightData = calculateDiameterAndHeight(root.right);

        int currentDiameter = Math.max(leftData.height + rightData.height, 
                                        Math.max(leftData.diameter, rightData.diameter));
        int currentHeight = Math.max(leftData.height, rightData.height) + 1;

        return new DiameterData(currentDiameter, currentHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        // Calculate diameter and height using helper function
        DiameterData data = calculateDiameterAndHeight(root);
        
        // Return the diameter (maximum path length)
        return data.diameter;
    }
}
