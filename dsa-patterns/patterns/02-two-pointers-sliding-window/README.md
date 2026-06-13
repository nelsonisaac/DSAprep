# Two Pointers & Sliding Window

## When to use
- Sorted arrays where you need to find elements that meet constraints (e.g. sums)
- Palindrome checks (character matching from both ends)
- Subarray / substring problems (checking sums, unique chars within a contiguous slice of input)
- Cycle detection (fast and slow pointer approach)

## Core ideas
- **Two Pointers from Ends**: Maintain `left` starting at 0 and `right` at the end of the array, shrink the range based on condition comparison.
- **Sliding Window (Fixed)**: Maintain a window of constant size `k`, slide it forward, updating the result incrementally.
- **Sliding Window (Variable)**: Maintain a window of variable size with `left` and `right`. Expand `right` to include elements, and shrink `left` when constraints are violated.

## References
- Sean Prashad LeetCode Patterns – Two Pointers, Sliding Window
- NeetCode / Grokking style patterns

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Longest Substring Without Repeating Characters | https://leetcode.com/problems/longest-substring-without-repeating-characters/ | Medium | 🔄 | Variable window with Map tracking |
| 2 | Container With Most Water | https://leetcode.com/problems/container-with-most-water/ | Medium | 🔄 | Two pointers from ends, greedy move |
| 3 | 3Sum | https://leetcode.com/problems/3sum/ | Medium | 🔄 | Sort array + fixed first pointer + two pointers |
