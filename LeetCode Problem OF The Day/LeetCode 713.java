27-03-2024


713. Subarray Product Less Than K
Solved
Medium
Topics
Companies
Hint
Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.

 

Example 1:

Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.


  class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
      int len=nums.length;
      if(len<=1){
        return 0;
      }
      int count =0;
      for(int i=0;i<=len-1;i++){
        int prod=0;
        prod=nums[i];
        if(prod<k){
          count++;
          for(int j=i+1;j<=len-1&&prod<k;j++){
            prod*=nums[j];
            if(prod<k){
              count++;
            }
          }
        }
      }
      return count;  
    }
}
