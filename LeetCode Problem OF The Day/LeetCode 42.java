42. Trapping Rain Water
Solved
Hard
Topics
Companies
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.



  class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];

        int lefts=0;
        for(int i=0;i<height.length;i++){
            left[i] = Math.max(lefts,height[i]);
            lefts = left[i];
        }

        int rights =Integer.MIN_VALUE;
        for(int i=height.length-1;i>=0;i--){
            right[i] = Math.max(rights,height[i]);
            rights = right[i];
        }

        int result =0;

        for(int i=1;i<height.length;i++){
            result = result + Math.min(left[i],right[i]) - height[i];
        }




        return result;

        
    }
}
