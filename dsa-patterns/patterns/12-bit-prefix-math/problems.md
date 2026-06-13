# Bit Manipulation, Prefix Sums & Math: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Bit Manipulation, Prefix Sums & Math category.

---

## 1. Single Number (LeetCode 136)

### Problem Description
Given a non-empty array of integers `nums`, every element appears twice except for one. Find that single one. You must implement a solution with a linear runtime complexity and use only constant extra space.

### Conceptual Walkthrough
- **Optimal XOR Approach ($O(N)$ time, $O(1)$ space)**:
  - Initialize `result = 0`.
  - Loop through each number in `nums`:
    - Perform bitwise XOR between result and current number: `result ^= num`.
  - Since $X \oplus X = 0$, all elements that appear twice will cancel each other out to 0.
  - The remaining value in `result` will be the unique element that appeared once.

---

## 2. Number of 1 Bits (LeetCode 191)

### Problem Description
Write a function that takes the binary representation of a positive integer and returns the number of set bits (also known as the Hamming weight).

### Conceptual Walkthrough
- **Standard Shift Approach ($O(32)$ time, $O(1)$ space)**:
  - Loop 32 times (or while `n != 0` for unsigned logic).
  - Check the last bit using bitwise AND: `(n & 1)`. If it is 1, increment count.
  - Right shift `n` by 1: `n >>>= 1`.
- **Brian Kernighan's Algorithm ($O(\text{set bits})$ time, $O(1)$ space)**:
  - Performing `n & (n - 1)` clears the lowest set bit of `n`.
  - While `n != 0`:
    - Clear lowest set bit: `n = n & (n - 1)`.
    - Increment count.
  - This is faster than standard shift because it only runs as many times as there are set bits (e.g. for `00100` it runs exactly once).

---

## 3. Subarray Sum Equals K (LeetCode 560)

### Problem Description
Given an array of integers `nums` and an integer `k`, return the total number of subarrays whose sum equals to `k`. A subarray is a contiguous non-empty sequence of elements within an array.

### Conceptual Walkthrough
- **Map-Assisted Prefix Sums ($O(N)$ time, $O(N)$ space)**:
  - Maintain a cumulative running sum of elements `currentSum`.
  - Keep a `HashMap<Integer, Integer>` storing `(prefixSum, occurrenceCount)`. Initialize it with `(0, 1)` to handle subarrays starting from index 0.
  - Maintain a counter `count = 0`.
  - Iterate through `nums`:
    - Add current number to `currentSum`.
    - Check if `currentSum - k` exists in our hash map.
      - If it does, it means a previous cumulative sum `P` satisfies `currentSum - P == k`. Add the count of occurrences of `currentSum - k` to our counter.
    - Increment the frequency of `currentSum` in the map.
  - Return `count`.
