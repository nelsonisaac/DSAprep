# Trees: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Trees category.

Also includes the common `TreeNode` definition structure.

---

## 📌 Common Data Structure: TreeNode

```java
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
```

---

## 1. Invert Binary Tree (LeetCode 226)

### Problem Description
Given the `root` of a binary tree, invert the tree, and return its root.

### Conceptual Walkthrough
- **Recursive DFS ($O(N)$ time, $O(H)$ space where $H$ is tree height)**:
  - If the `root` is null, return `null` (base case).
  - Recursively invert the left subtree: `TreeNode left = invertTree(root.left)`.
  - Recursively invert the right subtree: `TreeNode right = invertTree(root.right)`.
  - Swap children: `root.left = right; root.right = left;`.
  - Return the `root`.

---

## 2. Maximum Depth of Binary Tree (LeetCode 104)

### Problem Description
Given the `root` of a binary tree, return its maximum depth. A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

### Conceptual Walkthrough
- **Recursive DFS ($O(N)$ time, $O(H)$ space)**:
  - Base case: `if (root == null) return 0;`.
  - Solve for left subtree: `int leftDepth = maxDepth(root.left);`.
  - Solve for right subtree: `int rightDepth = maxDepth(root.right);`.
  - Combine answers: The depth at the current node is `1` plus the maximum of the depths of its subtrees: `return Math.max(leftDepth, rightDepth) + 1;`.

---

## 3. Binary Tree Level Order Traversal (LeetCode 102)

### Problem Description
Given the `root` of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

### Conceptual Walkthrough
- **Queue-Based BFS ($O(N)$ time, $O(N)$ space)**:
  - Initialize a Queue of `TreeNode` and add the `root` (if not null).
  - While the Queue is not empty:
    1. Count the number of nodes at the current level: `int levelSize = queue.size()`.
    2. Create a list to store values of the current level: `List<Integer> currentLevel = new ArrayList<>()`.
    3. Loop `levelSize` times:
       - Poll a node from the Queue.
       - Add its value to `currentLevel`.
       - Add its left and right children to the Queue if they are not null.
    4. Add `currentLevel` to the final results list.
  - Return the results list.
