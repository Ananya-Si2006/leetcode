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
    public ListNode removeNthFromEnd(ListNode head, int k) {
        ListNode list=new ListNode(0);
        list.next=head;
        ListNode slow=list;
        ListNode fast=list;
        for(int i=0;i<=k;i++)
        { 
            
            
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return list.next;
        
    }
}