# Heaps & Top K Elements

## When to use
- Tracking the largest, smallest, or most frequent $K$ elements in a dynamic array
- Finding the running median of a data stream
- Scheduling tasks based on priority (Dijkstra's shortest path, CPU task schedulers)
- Merging sorted lists or arrays efficiently

## Core ideas
- **Heap / Priority Queue**: A binary tree structure that maintains the min or max element at the root. In Java, `PriorityQueue` is a Min-heap by default. A Max-heap is created using `new PriorityQueue<>(Collections.reverseOrder())` or passing a comparator `(a, b) -> Integer.compare(b, a)`.
- **Top K Elements (Min-heap)**: Maintain a Min-heap of size $K$. For each element, insert it into the heap. If heap size exceeds $K$, poll the minimum element out. At the end, the heap will contain the $K$ largest elements. Complexity: $O(N \log K)$.
- **Two Heaps (Median)**: Split elements into two halves. Keep the smaller half in a Max-heap and the larger half in a Min-heap. The median is computed in $O(1)$ time from the root elements of the two heaps.

## References
- Sean Prashad LeetCode Patterns – Heaps, Priority Queue
- NeetCode 150 – Heaps / Priority Queue

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Kth Largest Element in an Array | https://leetcode.com/problems/kth-largest-element-in-an-array/ | Medium | 🔄 | Size-k Min-heap or Quickselect |
| 2 | Top K Frequent Elements | https://leetcode.com/problems/top-k-frequent-elements/ | Medium | 🔄 | Count occurrences, Min-heap on frequencies or Bucket Sort |
| 3 | Find Median from Data Stream | https://leetcode.com/problems/find-median-from-data-stream/ | Hard | 🔄 | Max-heap (small half) + Min-heap (large half) balance |
