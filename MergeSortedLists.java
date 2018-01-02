
//Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode lst;
        if (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                lst = new ListNode(l1.val);
                l1 = l1.next;
            }
            else {
                lst = new ListNode(l2.val);
                l2 = l2.next;
            }
        }
        else if (l1 != null){
            lst = new ListNode(l1.val);
            l1 = l1.next;
        }
        else if (l2 != null){
            lst = new ListNode(l2.val);
            l2 = l2.next;
        }
        else {
            return null;
        }
        ListNode lnext = lst;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                lnext.next = l1;
                l1 = l1.next;
                lnext = lnext.next;
            }
            else {
                lnext.next = l2;
                l2 = l2.next;
                lnext = lnext.next;
            }
        }
        if (l1 != null){
            lnext.next = l1;
        }
        else if (l2 != null){
            lnext.next = l2;
        }
        return lst;
    }
}
