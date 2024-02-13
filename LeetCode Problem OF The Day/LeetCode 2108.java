13-02-2024

2108. Find First Palindromic String in the Array
Easy
Topics
Companies
Hint
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.


  First Way To solve the problem,

  using Build in class of string - 

  public String firstPalindrome(String[] words){

  for(String value: words){
    StringBuilder s = new StringBuilder(value);
    if(value.equals(s.reverse().toString()){
    return value;
    }

  return "";

  }
}

Time Complexity - O(N logN)
  Space Complexity - O(N*M) 

2 Solution using two pointers approach - 

class Solution {

    public static boolean kushagra(String s){

        int left = 0;
        int right = s.length() - 1;

        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public String firstPalindrome(String[] words) {

        for(String value:words){

            if(kushagra(value)){
                return value;
            }
        }
        return "";
        
    }
}
