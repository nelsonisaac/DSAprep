class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // TODO: Implement iterative in-place linked list reversal.
        // 1. Maintain a prev pointer (null) and curr pointer (head).
        // 2. Loop until curr is null.
        // 3. Keep temp pointer to curr.next, reverse linkage, shift prev/curr.
        // 4. Return prev.
        return null;
    }
}

