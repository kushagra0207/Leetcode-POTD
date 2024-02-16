16-02-2024

  1481. Least Number of Unique Integers after K Removals
Medium
Topics
Companies
Hint
Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.

  Use HashMap And Min Heap (Priority Queues)

  Complexity
- Time complexity: O(N logN)
- Space complexity: O(N)

  class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int value:arr){
            hm.put(value,hm.getOrDefault(value,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(hm.values());
        while(!pq.isEmpty() && k>0){
            int data = pq.poll();
            if(k >= data){
                k = k-data;
            }
            else{
                return pq.size()+1;
            }
        }
        return pq.size(); 
    }
}






Kushagra Gupta Solution - https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/solutions/4735300/easy-solution-beginners-friendly-heap-hashmap
