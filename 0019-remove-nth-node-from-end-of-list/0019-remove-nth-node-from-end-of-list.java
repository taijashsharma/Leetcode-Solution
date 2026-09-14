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

        if(head==null){
            return null;
        }
        // for length
        int length =0;
        ListNode temp = head;
        while(temp!=null){
        length++;
        temp = temp.next;
        }
        // if in 1st position 
        if(n==length){
            return head.next;
        }
        // for last se -1 tak k lie 
        ListNode prev = head;
        for(int i=0; i< length-n-1; i++){
            prev= prev.next;
        }
        // mera logic 

        ListNode curr = prev.next;
        ListNode forward = curr.next;

        curr.next=null;
        prev.next=forward;
        
    return head;
    }
}