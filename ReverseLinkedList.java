import java.util.Hashtable;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode l1;
        while (head != null) {
            l1 = head.next;
            head.next = prev;
            prev = head;
            head = l1;

        }
        return prev;
    }
}
