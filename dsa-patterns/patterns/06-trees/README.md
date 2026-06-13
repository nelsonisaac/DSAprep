# Trees

## When to use
- Hierarchical structures containing nodes with parent-child relationships
- Traversals (Pre-order, In-order, Post-order, Level-order)
- Pathfinding, sub-tree evaluations, or height/depth calculations
- BST (Binary Search Tree) validation, search, or insertion problems

## Core ideas
- **Recursive Depth-First Search (DFS)**: Process a node, then recursively solve the problem for its left and right subtrees. The base case is usually `if (node == null) return ...`.
- **Breadth-First Search (BFS) / Level-Order**: Use a Queue to visit nodes level by level. In each iteration, count the size of the queue to process all nodes at the current level together.
- **BST Property**: For any node, all values in its left subtree are less than the node's value, and all values in its right subtree are greater. An in-order traversal of a BST yields sorted elements.

## References
- Sean Prashad LeetCode Patterns – Trees
- NeetCode 150 – Trees

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Invert Binary Tree | https://leetcode.com/problems/invert-binary-tree/ | Easy | 🔄 | Simple swap left/right children recursively |
| 2 | Maximum Depth of Binary Tree | https://leetcode.com/problems/maximum-depth-of-binary-tree/ | Easy | 🔄 | Recursion depth `1 + max(left, right)` |
| 3 | Binary Tree Level Order Traversal | https://leetcode.com/problems/binary-tree-level-order-traversal/ | Medium | 🔄 | BFS using Queue with level-by-level tracking |
