/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        if(head==null){
            return null;
        }
        Node curr = head;

        while(curr!=null){
            if(curr.child!=null){
            Node temp = curr.next;
            Node childHead = curr.child;
            
            //curr ko childhead se connect krna 
            curr.next = childHead;
            childHead.prev = curr;
            curr.child = null;

            // child se tail tak jana 

            Node tail = childHead;
                while(tail.next!=null){
                    tail = tail.next;
                }
                tail.next=temp;
                if(temp!=null){
                    temp.prev=tail;
                }
            }
            curr=curr.next;
        }
        return head;
    }
}