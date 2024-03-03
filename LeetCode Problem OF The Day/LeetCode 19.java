03-03-2024

  19. Remove Nth Node From End of List
Solved
Medium
Topics
Companies
Hint
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        
        ListNode Second = head;
        ListNode first = head;

        while(n!=0){
            n--;
            Second = Second.next;
            if(Second == null) return head.next;
        }
       

        while(Second.next!=null){
            first = first.next;
            Second = Second.next;
        }

        first.next = first.next.next;
        return head;
        
    }
}

