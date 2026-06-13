# Linked List

## When to use
- Sequential data structures that require rapid node insertion or deletion
- In-place reversal or modifications of element linkages
- Detecting loops or finding circular components in traversal (Fast & Slow Pointers)
- Merging, splitting, or reordering node positions

## Core ideas
- **Dummy Node**: Use a sentinel head (`ListNode dummy = new ListNode(0)`) to simplify edge cases when modifying head linkages or building lists dynamically.
- **Two Pointers (Fast/Slow)**: Use two references moving at different speeds (slow moves 1 step, fast moves 2 steps) to detect cycles or find list midpoints.
- **In-place Reversal**: Update the `next` reference of the current node to point to the previous node step-by-step, using a temporary pointer to preserve the list tail.

## References
- Sean Prashad LeetCode Patterns – Linked List
- NeetCode 150 – Linked Lists

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Reverse Linked List | https://leetcode.com/problems/reverse-linked-list/ | Easy | 🔄 | Iterative pointer redirection |
| 2 | Merge Two Sorted Lists | https://leetcode.com/problems/merge-two-sorted-lists/ | Easy | 🔄 | Dummy node, pointer weaving |
| 3 | Linked List Cycle | https://leetcode.com/problems/linked-list-cycle/ | Easy | 🔄 | Floyd's Cycle Detection (Tortoise/Hare) |
