package algorithms;

public class Add_Two_Numbers_002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(true){
            if(l1 == null && l2 == null){
                if(carry > 0){
                    tail.next = new ListNode(carry);
                }
                break;
            }

            int a = 0;
            int b = 0;

            if(l1 != null){
                a = l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                b = l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode((a + b + carry)%10);
            carry = (a + b + carry)/10;
            tail.next = node;
            tail = tail.next;
        }

        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
}
