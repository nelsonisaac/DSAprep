# Stack & Queue

## When to use
- Matching pairs or parsing nested structures (e.g. parentheses, HTML tags, expression evaluation)
- Tracking elements in LIFO (Last In First Out) or FIFO (First In First Out) order
- Finding the next greater/smaller element (Monotonic Stack)
- Backtracking state histories or simulating recursion

## Core ideas
- **Stack (LIFO)**: Push elements onto the stack and pop them. Perfect for backtracking and nested scopes.
- **Queue (FIFO)**: Queue elements for processing in standard order (often used in BFS).
- **Monotonic Stack**: Keep stack elements in strictly increasing or decreasing order. When a new element violates the order, pop until the order is restored, processing the popped elements.

## References
- NeetCode 150 – Stacks
- Sean Prashad LeetCode Patterns – Stacks, Queues

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Valid Parentheses | https://leetcode.com/problems/valid-parentheses/ | Easy | 🔄 | Map matching brackets, stack verify |
| 2 | Evaluate Reverse Polish Notation | https://leetcode.com/problems/evaluate-reverse-polish-notation/ | Medium | 🔄 | Stack-based operator application |
| 3 | Min Stack | https://leetcode.com/problems/min-stack/ | Medium | 🔄 | Dual stacks or node wrapper |
