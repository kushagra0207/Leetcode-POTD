15-03-2024


  238. Product of Array Except Self
Solved
Medium
Topics
Companies
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.


  class Solution {
    public int[] productExceptSelf(int[] nums) {
        int temp = 1;
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=temp;
            temp = temp * nums[i];

        }
        temp = 1;
        for(int i=nums.length-1;i>=0;i--){
            result[i]=result[i]*temp;
            temp = temp*nums[i];
        }
        return result;
    }
}
