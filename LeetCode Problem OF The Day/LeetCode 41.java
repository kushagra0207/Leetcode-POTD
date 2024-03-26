41. First Missing Positive
Solved
Hard
Topics
Companies
Hint
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.



  

class Solution {
    public int firstMissingPositive(int[] nums) {
         final int n = nums.length;

    // Correct slot:
    // nums[i] = i + 1
    // nums[i] - 1 = i
    // nums[nums[i] - 1] = nums[i]
    for (int i = 0; i < n; ++i)
      while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1])
        swap(nums, i, nums[i] - 1);

    for (int i = 0; i < n; ++i)
      if (nums[i] != i + 1)
        return i + 1;

    return n + 1;
  }

  private void swap(int[] nums, int i, int j) {
    final int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;  
    }
}
