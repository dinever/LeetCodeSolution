/**
 * Created by dinever on 11/5/15.
 */

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode m = l1;
        ListNode n = l2;
        ListNode current_node = ret;
        int carry_bit = 0;
        while(m != null || n != null) {
            int new_value;
            if (m == null) {
                new_value = n.val + carry_bit;
                n = n.next;
            } else if (n == null) {
                new_value = m.val + carry_bit;
                m = m.next;
            } else {
                new_value = n.val + m.val + carry_bit;
                n = n.next;
                m = m.next;
            }
            current_node.next = new ListNode(new_value % 10);
            current_node = current_node.next;
            carry_bit = new_value / 10;
        }
        if (carry_bit == 1) {
            // For example, if input are [5], [5], we need to make sure output is [0, 1], not [0].
            current_node.next = new ListNode(1);
        }
        return ret.next;
    }

    /**
     * Definition for singly-linked list.
     *
     */
    public class ListNode {
       int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
