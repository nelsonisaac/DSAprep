# Greedy & Intervals: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Greedy & Intervals category.

---

## 1. Merge Intervals (LeetCode 56)

### Problem Description
Given an array of `intervals` where `intervals[i] = [start_i, end_i]`, merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

### Conceptual Walkthrough
- **Sorting Approach ($O(N \log N)$ time, $O(N)$ space)**:
  - If the input length is $\le 1$, return `intervals` directly.
  - Sort the intervals array by their start values `a[0]`.
  - Maintain a list of merged intervals, initialized with the first sorted interval.
  - Iterate through the sorted intervals from index 1 to the end:
    - Let the last merged interval in our list be `curr` and the next interval be `next`.
    - If `curr[1] >= next[0]` (there is an overlap), merge them by updating `curr[1] = max(curr[1], next[1])`.
    - Otherwise, there is no overlap. Simply add `next` to the merged list and update `curr` to be `next`.
  - Convert the list to an array and return it.

---

## 2. Insert Interval (LeetCode 57)

### Problem Description
You are given an array of non-overlapping intervals `intervals` sorted in ascending order by start time. You are also given `newInterval`. Insert `newInterval` into `intervals` such that `intervals` is still sorted in ascending order and does not contain overlapping intervals (merge if necessary).

### Conceptual Walkthrough
- **Three-Stage Linear Scan ($O(N)$ time, $O(N)$ space)**:
  - We can construct the output list in three steps:
    1. **Add all intervals that end before the new interval starts**: `interval[1] < newInterval[0]`. These do not overlap and should precede `newInterval`.
    2. **Merge all overlapping intervals**: While the current interval starts before or at the new interval's end (`interval[0] <= newInterval[1]`), merge them:
       - `newInterval[0] = min(newInterval[0], interval[0])`
       - `newInterval[1] = max(newInterval[1], interval[1])`
       - Move to the next interval.
       - Finally, add the merged `newInterval`.
    3. **Add all remaining intervals** that start after the merged interval ends.
  - Convert list to array and return.

---

## 3. Non-overlapping Intervals (LeetCode 435)

### Problem Description
Given an array of intervals `intervals` where `intervals[i] = [start_i, end_i]`, return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

### Conceptual Walkthrough
- **Greedy Interval Scheduling ($O(N \log N)$ time, $O(1)$ space depending on sort)**:
  - This problem can be framed as: "Find the maximum number of non-overlapping intervals we can schedule, then subtract this from the total number of intervals."
  - **Greedy choice**: Always select the interval that ends first (earliest end time). This leaves the maximum possible space for subsequent intervals.
  - Sort the intervals by their end times `a[1]`.
  - Initialize a count of non-overlapping intervals to `1` (using the first interval) and set `prevEnd = intervals[0][1]`.
  - Iterate through the remaining sorted intervals:
    - If the current interval's start time `interval[0]` is $\ge$ `prevEnd`, it does not overlap. Increment our non-overlapping count and update `prevEnd = interval[1]`.
    - If it starts before `prevEnd`, it overlaps. Skip it (which counts as an extraction/deletion).
  - The answer is `intervals.length - nonOverlappingCount`.
