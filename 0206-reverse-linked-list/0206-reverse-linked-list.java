class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next; // Next node ko save kar lo
            curr.next = prev;              // Pointer ko reverse kar do
            prev = curr;                   // Prev ko aage badhao
            curr = nextTemp;               // Curr ko aage badhao
        }
        
        return prev; // Naya head prev hoga
    }
}