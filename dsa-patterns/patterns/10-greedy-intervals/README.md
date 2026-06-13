# Greedy & Intervals

## When to use
- Problems requiring scheduling, calendars, range overlays, or meeting rooms
- Minimizing resource utilization or maximizing concurrent events
- Making local optimal choices at each step that lead to a globally optimal solution

## Core ideas
- **Sorting**: Almost all interval problems require sorting intervals first (by start times, or sometimes by end times) to establish sequential order.
- **Greedy Strategy**: Make the optimal choice at the current interval. E.g., for non-overlapping intervals, prioritize keeping the interval that finishes earliest to leave maximum room for future intervals.
- **Interval Overlap Checks**: Two intervals `A` and `B` overlap if:
  `A[start] <= B[end] && B[start] <= A[end]`
- **Merging Logic**: When merging overlapping intervals, the new interval boundaries are:
  `[ min(A[start], B[start]), max(A[end], B[end]) ]`

## References
- Sean Prashad LeetCode Patterns – Intervals
- NeetCode 150 – Greedy, Intervals

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Merge Intervals | https://leetcode.com/problems/merge-intervals/ | Medium | 🔄 | Sort by start times, merge overlapping ranges |
| 2 | Insert Interval | https://leetcode.com/problems/insert-interval/ | Medium | 🔄 | Insert in order, then merge overlapping elements |
| 3 | Non-overlapping Intervals | https://leetcode.com/problems/non-overlapping-intervals/ | Medium | 🔄 | Sort by end times, greedily remove overlaps |
