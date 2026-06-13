# Two Pointers & Sliding Window: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Two Pointers & Sliding Window category.

---

## 1. Longest Substring Without Repeating Characters (LeetCode 3)

### Problem Description
Given a string `s`, find the length of the longest substring without repeating characters.

### Conceptual Walkthrough
- **Optimal Sliding Window ($O(N)$ time, $O(M)$ space where $M$ is alphabet size)**:
  - Maintain a sliding window using two pointers `left` and `right`.
  - Use a hash map or array (like `int[128]` for ASCII) to store the last seen index of each character.
  - Iterate `right` from `0` to `s.length() - 1`:
    - If the current character `s.charAt(right)` was seen before inside the current window, shift `left` to `map.get(char) + 1` to exclude the repeat.
    - Update/insert the current character's index in the map.
    - Calculate window length: `right - left + 1` and update the maximum length found so far.

---

## 2. Container With Most Water (LeetCode 11)

### Problem Description
You are given an integer array `height` of length `n`. Find two lines that together with the x-axis form a container, such that the container contains the most water. Return the maximum amount of water a container can store.

### Conceptual Walkthrough
- **Two Pointers Approach ($O(N)$ time, $O(1)$ space)**:
  - Initialize two pointers at the boundaries: `left = 0`, `right = height.length - 1`.
  - The area is constrained by the shorter boundary: `Area = (right - left) * min(height[left], height[right])`.
  - To maximize the area, greedily move the pointer pointing to the shorter line inward:
    - If `height[left] < height[right]`, then `left++`.
    - Else, `right--`.
  - Keep track of the maximum area during the traversal.

---

## 3. 3Sum (LeetCode 15)

### Problem Description
Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`. Notice that the solution set must not contain duplicate triplets.

### Conceptual Walkthrough
- **Optimal Sort + Two Pointers ($O(N^2)$ time, $O(1)$ or $O(N)$ space depending on sorting algorithm)**:
  - First, sort the array `nums` in ascending order.
  - Iterate through the array with pointer `i` up to `nums.length - 2`:
    - Skip duplicate elements for `i` to avoid duplicate triplets (`nums[i] == nums[i-1]`).
    - Set up a two-pointer search for the remaining two elements: `left = i + 1`, `right = nums.length - 1`.
    - While `left < right`:
      - If `nums[i] + nums[left] + nums[right] == 0`, save the triplet, increment `left`, decrement `right`, and skip duplicates for `left` and `right`.
      - If sum is less than `0`, we need a larger value, so `left++`.
      - If sum is greater than `0`, we need a smaller value, so `right--`.
