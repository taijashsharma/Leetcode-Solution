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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next =head;

        ListNode left = dummy;
        while(left!=null){
            int sum =0;
            ListNode right = left.next;
            while(right!=null){
                sum+=right.val;

                if(sum==0){
                    left.next=right.next;
                }
                right=right.next;
            }
            left=left.next;
        }
        return dummy.next;
    }
}