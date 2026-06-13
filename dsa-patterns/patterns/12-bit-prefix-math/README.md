# Bit Manipulation, Prefix Sums & Math

## When to use
- Custom arithmetic or low-level logic operations (sub-byte optimization)
- Matching unique entries when numbers appear twice (XOR)
- Finding sum/count of contiguous subarrays that meet conditions (Prefix Sums)
- Mathematical number theory properties (prime factors, GCD, power calculations)

## Core ideas
- **Bitwise XOR properties**: 
  - $A \oplus A = 0$ (XORing any number by itself cancels it out)
  - $A \oplus 0 = A$
  - XOR is associative and commutative. Essential for finding the unique element where all others repeat exactly twice.
- **Bit Counting**:
  - Use `n & (n - 1)` to clear the lowest set bit. Repeat this until `n == 0` to count set bits (Brian Kernighan's Algorithm).
- **Prefix Sums**:
  - Precompute cumulative sums where `prefix[i] = nums[0] + nums[1] + ... + nums[i]`.
  - The sum of subarray `nums[i...j]` is calculated in $O(1)$ time as: `prefix[j] - prefix[i-1]`.
  - We can count subarrays summing to $K$ by storing prefix sum occurrences in a hash map as we iterate, checking if `currentPrefix - k` exists in the map.

## References
- Sean Prashad LeetCode Patterns – Math, Bit Manipulation
- NeetCode 150 – Bit Manipulation, Math & Geometry

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Single Number | https://leetcode.com/problems/single-number/ | Easy | 🔄 | XOR cancellation trick |
| 2 | Number of 1 Bits | https://leetcode.com/problems/number-of-1-bits/ | Easy | 🔄 | Bitwise shifting or Kernighan's bit-clearing |
| 3 | Subarray Sum Equals K | https://leetcode.com/problems/subarray-sum-equals-k/ | Medium | 🔄 | Cumulative Prefix sum hash map tracking |
