2958. Length of Longest Subarray With at Most K Frequency
Solved
Medium
Topics
Companies
Hint
You are given an integer array nums and an integer k.

The frequency of an element x is the number of times it occurs in an array.

An array is called good if the frequency of each element in this array is less than or equal to k.

Return the length of the longest good subarray of nums.

A subarray is a contiguous non-empty sequence of elements within an array.

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
            while (mp.get(nums[r]) > k) {
                mp.put(nums[l], mp.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
