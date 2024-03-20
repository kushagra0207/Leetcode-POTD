20-03-2024

  1669. Merge In Between Linked Lists
Solved
Medium
Topics
Companies
Hint
You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

The blue edges and nodes in the following figure indicate the result:

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode curr = list1;
        int count =0;
        ListNode first = list1;
        ListNode second = list1;

        while(curr!=null){
            if(count==a-1){
                first = curr;
            }
            if(count == b){
                second = curr.next;
            }
            curr = curr.next;
            count++;
        }

        first.next = list2;
        curr = list2;

        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = second;



        return list1;
        
    }
}
