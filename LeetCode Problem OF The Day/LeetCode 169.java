12-02-2024


169. Majority Element
Easy
Topics
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

  Time Complexity - O(N logN)
  Space Complexity - O(1) 

  As we know the array must contain a result. and the result will be greater than n/2. if it is greater than n/2, the element will be present at middle also.
  class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}


HashMap Solution - >
TimeComplexity - O(n)
  Space Complexity - O(n)

  class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        
       for(HashMap.Entry<Integer,Integer> value:hm.entrySet()){
           if(value.getValue()>nums.length/2){
               return value.getKey();
           }
       }
        return nums[0];
        
    }
}

Moores Voting algorithm -> 

  Time Complexity - O(N)
  Space Complexity - O(1)

  class Solution {
    public int majorityElement(int[] nums) {

        int count = 1;
        int major = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[major]) {
                count++;

            } else {
                count--;
            }

            if (count == 0) {
                count = 1;
                major = i;

            }
        }
        count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[major]) {
                count++;

            }
            if (count > nums.length / 2) {
                return nums[major];
            }
        }
        return -1;

    }
}
