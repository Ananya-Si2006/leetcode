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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list=new ListNode(0);
        list.next=head;
        ListNode i=list;
        ListNode j=list;
        for(int k=0;k<=n;k++)
        {
            j=j.next;
        }
        while(j!=null)
        {
            j=j.next;
            i=i.next;
        }
        i.next=i.next.next;
        return list.next;
        
    }
}