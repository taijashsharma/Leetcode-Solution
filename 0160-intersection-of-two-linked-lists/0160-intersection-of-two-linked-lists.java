/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> set=new HashSet<>();

        ListNode tempA=headA;
        while(tempA!=null){
            set.add(tempA);
            tempA= tempA.next;
        }

         ListNode tempB=headB;
        while(tempB!=null){
            if(set.contains(tempB)){
                return tempB;
            }
            tempB= tempB.next;
        }
        return null;

        // if(headA ==null && headB==null){
        //     return null;
        // }

        // while(headA!=null && headB!=null){
        //     if(headA.next==headB.next){
        //         return headA.next;
        //     }
        // }
        // return null;
    }
        
    
}