package algorithms;

public class Remove_Nth_Node_From_End_of_List_019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        while (n-- > 0) {
            node = node.next;
        }

        ListNode rem = new ListNode(0);
        rem.next = head;
        while (node != null) {
            node = node.next;
            rem = rem.next;
        }

        if (rem.next == head) {
            return head.next;
        }
        rem.next = rem.next.next;
        return head;
    }
}
