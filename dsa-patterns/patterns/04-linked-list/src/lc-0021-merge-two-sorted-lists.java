// ListNode definition is package-private. Assuming same package or same file.
// If compiling separately, can share the ListNode class. Here we define it locally.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TODO: Implement sorting merge using a dummy sentinel node.
        // 1. Create a dummy node and curr pointer.
        // 2. Loop while both list1 and list2 are not null.
        // 3. Connect smaller element to curr.next, move list pointer.
        // 4. Connect remaining elements from non-empty list.
        // 5. Return dummy.next.
        return null;
    }
}

