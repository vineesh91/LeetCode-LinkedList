import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class ListHasCycle {
    public boolean hasCycle(ListNode head) {
        List<ListNode> numList = new ArrayList<ListNode>();
        while(head != null) {
            if (numList.contains(head))
                return true;
            else {
                numList.add(head);
                head = head.next;
            }
        }
        return false;
    }
}
