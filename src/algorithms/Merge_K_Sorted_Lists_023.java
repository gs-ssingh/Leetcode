package algorithms;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_K_Sorted_Lists_023 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        ListNode tail = res;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new ListNodeComparator());
        for (ListNode listNode : lists) {
            if (listNode != null) {
                priorityQueue.add(listNode);
            }
        }
        while (!priorityQueue.isEmpty()) {
            ListNode listNode = priorityQueue.poll();
            tail.next = listNode;
            tail = tail.next;
            if (listNode.next != null) {
                priorityQueue.add(listNode.next);
            }
        }
        return res.next;
    }

    private class ListNodeComparator implements Comparator<ListNode> {

        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }
}
