package algorithms;

public class Swap_Nodes_In_Pairs_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (head != null && head.next != null) {
            ListNode temp = head;
            tail.next = head.next;
            head = head.next.next;
            tail.next.next = temp;
            tail = tail.next.next;
        }
        if (head != null) {
            tail.next = head;
        }
        return dummy.next;
    }
}
