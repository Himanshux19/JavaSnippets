// Day 146 : Remove nth node

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null || head.next==null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        for (int j=1;j<=n;j++) {
            fast = fast.next;
        }
        if (fast==null)
            return head.next;
        while (fast.next!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
