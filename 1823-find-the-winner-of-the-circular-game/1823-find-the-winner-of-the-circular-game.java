class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1){
            return 1;
        }
        ListNode head = new ListNode(1);
        ListNode curr = head;

        for(int i=2; i<=n; i++){
            curr.next = new ListNode(i);
            curr=curr.next;
        }
        curr.next = head;
    
    ListNode prev = curr;
    curr=head;

    while(curr.next!=curr){
        for(int i =0; i<k-1; i++){
            prev = curr;
            curr= curr.next;
        }
        prev.next=curr.next;
        curr=prev.next;
    }
    return curr.val;
    }
}