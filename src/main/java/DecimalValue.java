public class DecimalValue {

    public int getDecimalValue(ListNode head) {
        StringBuilder result = new StringBuilder();
        ListNode next = head;
        while (next != null) {
            result.append(next.val);
            next = next.next;
        }
        return Integer.parseInt(result.toString(), 2);
    }

    public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }
}
