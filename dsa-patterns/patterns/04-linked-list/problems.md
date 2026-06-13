# Linked List: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Linked List category.

Also includes the common `ListNode` definition structure.

---

## 📌 Common Data Structure: ListNode

```java
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
```

---

## 1. Reverse Linked List (LeetCode 206)

### Problem Description
Given the `head` of a singly linked list, reverse the list, and return the reversed list.

### Conceptual Walkthrough
- **Iterative Approach ($O(N)$ time, $O(1)$ space)**:
  - Initialize two pointers: `prev = null` and `curr = head`.
  - While `curr != null`:
    1. Temporarily store the next node: `ListNode nextTemp = curr.next`.
    2. Reverse the link: `curr.next = prev`.
    3. Shift pointers forward: `prev = curr` and `curr = nextTemp`.
  - At the end, `prev` will be pointing to the new head of the reversed list.

---

## 2. Merge Two Sorted Lists (LeetCode 21)

### Problem Description
You are given the heads of two sorted linked lists `list1` and `list2`. Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.

### Conceptual Walkthrough
- **Iterative Approach with Dummy Node ($O(N + M)$ time, $O(1)$ space)**:
  - Create a dummy sentinel node `ListNode dummy = new ListNode(-1)`.
  - Maintain a pointer `curr` initialized to `dummy`.
  - While both `list1` and `list2` are not null:
    - Compare their values. Point `curr.next` to the node with the smaller value.
    - Advance that smaller node's pointer.
    - Advance the `curr` pointer.
  - After the loop, one list might still have remaining nodes. Append them: `curr.next = (list1 != null) ? list1 : list2`.
  - Return `dummy.next`.

---

## 3. Linked List Cycle (LeetCode 141)

### Problem Description
Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

### Conceptual Walkthrough
- **Floyd's Cycle Finding Algorithm ($O(N)$ time, $O(1)$ space)**:
  - Use two pointers: `slow` and `fast`, both starting at `head`.
  - Move `slow` forward by 1 step (`slow = slow.next`) and `fast` by 2 steps (`fast = fast.next.next`).
  - If there is no cycle, `fast` or `fast.next` will eventually reach `null`.
  - If there is a cycle, the faster pointer will loop around and eventually meet `slow` (i.e. `slow == fast`). If they meet, return `true`.
