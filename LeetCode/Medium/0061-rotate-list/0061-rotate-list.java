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
    public ListNode rotateRight(ListNode head, int k) {
        int len=length(head);
         if(head==null)
        return null;
        k%=len;
        if(k==0)
        return head;
       
        ListNode slow= head;
        ListNode fast=head;
        for(int i=1;i<=k+1;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode a= slow.next;
        slow.next=null;
        ListNode tail= a;
        while(tail.next!=null)
        {
            tail=tail.next;
        }
        tail.next=head;
        return a;
        
    }
    public int length(ListNode head)
    {
        int len=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            len++;
        }
        return len;
    }
}