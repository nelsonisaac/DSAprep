# Binary Search

## When to use
- Sorted arrays, sorted matrices, or sequences with monotonic behaviors
- Finding target elements, insertions, or boundaries in $O(\log N)$ time
- Optimization problems where you can "guess" the answer and verify validity ("binary search on answer space")

## Core ideas
- **Midpoint Calculation**: Always use `mid = left + (right - left) / 2` to prevent potential integer overflow (which occurs in Java with `(left + right) / 2` for very large lists).
- **Search Space Reduction**: Compare the middle element with target, then eliminate half of the remaining search space.
- **Rotated Array Logic**: In a rotated sorted array, at least one half of the array (divided by `mid`) is guaranteed to be sorted. Find which half is sorted, check if target lies in that range, and update pointers.

## References
- Sean Prashad LeetCode Patterns – Binary Search
- NeetCode 150 – Binary Search

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Binary Search | https://leetcode.com/problems/binary-search/ | Easy | 🔄 | Classic baseline template |
| 2 | Search in Rotated Sorted Array | https://leetcode.com/problems/search-in-rotated-sorted-array/ | Medium | 🔄 | Identifying sorted halves |
| 3 | Find Minimum in Rotated Sorted Array | https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/ | Medium | 🔄 | Convergence towards pivot element |
