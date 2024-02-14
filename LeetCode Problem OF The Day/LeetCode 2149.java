14-02-2024

2149. Rearrange Array Elements by Sign
Solved
Medium
Topics
Companies
Hint
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 


Two Pointers Approach - 
T.C - O(n)
S.C - O(n)


class Solution {
    public int[] rearrangeArray(int[] nums) {

        int arr[] = new int[nums.length];

        int negativeNumber = 1;
        int positiveNumber = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[positiveNumber] = nums[i];
                positiveNumber +=2;
            }
            else{
                arr[negativeNumber]=nums[i];
                negativeNumber +=2;
            }
        }

        return arr;
        
    }
}

for kushagra solution - https://leetcode.com/problems/rearrange-array-elements-by-sign/solutions/4724050/two-pointers-approach
