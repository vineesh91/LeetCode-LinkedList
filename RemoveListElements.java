public class RemoveListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(0);
        ListNode l1 = prev;
        while (head != null) {
            if (head.val != val) {
                prev.next = head;
                prev = prev.next;
            }
            head = head.next;
        }
        prev.next = head;
        return l1.next;
    }
}
