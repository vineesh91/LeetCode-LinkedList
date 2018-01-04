import java.util.Hashtable;

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

public class IntersectionLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        Hashtable<ListNode,Integer> lst = new Hashtable<ListNode,Integer>();
        while (l1 != null) {
            lst.put(l1,1);
            l1 = l1.next;
        }
        while (l2 != null) {
            if (lst.containsKey(l2)) {
                return l2;
            }
            l2 = l2.next;
        }
        return null;
    }
}
