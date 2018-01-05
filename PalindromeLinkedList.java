import java.util.Hashtable;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Hashtable<Integer,ListNode> htable = new Hashtable<Integer,ListNode>();
        ListNode l1 = head;
        int k = 0;
        while(l1 != null) {
            k++;
            htable.put(k,l1);
            l1 = l1.next;
        }
        int len = k;
        int p1 = len/2;
        int p2;
        if (len%2 == 0)
            p2 = len/2 +1;
        else
            p2 = len/2 +2;
        for (int i = p2; i <= len; i++) {
            if (htable.get(p1).val != htable.get(i).val)
                return false;
            p1--;
        }
        return true;
    }
}
