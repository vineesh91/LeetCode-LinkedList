public class RemoveDuplicatesSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newList = new ListNode(0);
        newList.next = head;
        ListNode retList = head;
        while(head != null) {
            int val = head.val;
            while (retList.next != null && retList.next.val == val) {
                retList = retList.next;
            }
            head.next = retList.next;
            retList = retList.next;
            head = head.next;
        }
        return newList.next;
    }

}
