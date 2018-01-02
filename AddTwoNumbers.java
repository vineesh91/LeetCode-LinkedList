
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode sumNext = sum;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int sumVal = l1.val + l2.val + carry;
            sumNext.next = new ListNode(sumVal%10);
            carry = sumVal/10;
            l1 = l1.next;
            l2 = l2.next;
            sumNext = sumNext.next;
        }
        while(l1 != null) {
            int sumVal = l1.val + carry;
            sumNext.next = new ListNode(sumVal%10);
            carry = sumVal/10;
            l1 = l1.next;
            sumNext = sumNext.next;
        }
        while(l2 != null) {
            int sumVal = l2.val + carry;
            sumNext.next = new ListNode(sumVal%10);
            carry = sumVal/10;
            l2 = l2.next;
            sumNext = sumNext.next;
        }
        if (carry != 0) {
            sumNext.next = new ListNode(carry);
        }
        return sum.next;
    }
}
