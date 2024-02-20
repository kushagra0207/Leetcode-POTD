20-02-2024

268. Missing Number
Solved
Easy

  
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



  
        for(int i=0;i<nums.length;i++){
            loop = loop + nums[i];

        }
        return (( nums.length * (nums.length+1)) /2) -loop;
