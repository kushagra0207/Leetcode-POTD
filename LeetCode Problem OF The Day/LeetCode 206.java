21-03-2024


  206. Reverse Linked List
Solved
Easy
Topics
Companies
Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = head;

        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;

        
    }
}
