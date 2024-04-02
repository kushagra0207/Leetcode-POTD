205. Isomorphic Strings
Solved
Easy
Topics
Companies
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.


class Solution {
    public boolean isIsomorphic(String s, String t) {
         Map<Character, Character> map=new  HashMap<>();
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            } else if(map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }
            set1.add(s.charAt(i));
            set2.add(t.charAt(i));
        }
        return map.size() == set1.size() && map.size() == set2.size();
    }
}
