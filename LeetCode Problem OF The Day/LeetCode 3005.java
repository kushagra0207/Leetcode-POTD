08-03-2024

  3005. Count Elements With Maximum Frequency
Solved
Easy
Topics
Companies
Hint
You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.


  class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        int maxFrequency = 0;

        for(int value: nums){
            hm.put(value,hm.getOrDefault(value,0)+1);
             maxFrequency = Math.max(maxFrequency,hm.get(value));

        }
        int sum = 0;
        
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            if(e.getValue()==maxFrequency){
                sum = sum + maxFrequency;
            }
        }
        return sum;
    }
}




https://leetcode.com/problems/count-elements-with-maximum-frequency/?envType=daily-question&envId=2024-03-08
