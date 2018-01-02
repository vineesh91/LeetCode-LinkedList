/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head;
        int totalNodes = 0;
        while (l != null) {
            totalNodes++;
            l = l.next;
        }
        ListNode newList = new ListNode(0);
        ListNode nextNode = newList;
        int k = 0;
        while(head != null) {
            if((totalNodes - k) == n) {
                head = head.next;
                k++;
            }
            else {
                nextNode.next = new ListNode(head.val);
                head = head.next;
                nextNode = nextNode.next;
                k++;
            }
        }
        return newList.next;
    }
}
