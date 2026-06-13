# Binary Search: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Binary Search category.

---

## 1. Binary Search (LeetCode 704)

### Problem Description
Given an array of integers `nums` which is sorted in ascending order, and an integer `target`, write a function to search `target` in `nums`. If `target` exists, then return its index. Otherwise, return `-1`.

### Conceptual Walkthrough
- **Optimal Iterative Binary Search ($O(\log N)$ time, $O(1)$ space)**:
  - Initialize pointers `left = 0`, `right = nums.length - 1`.
  - While `left <= right`:
    1. Calculate `mid = left + (right - left) / 2`.
    2. If `nums[mid] == target`, return `mid`.
    3. If `nums[mid] < target`, shift search space right: `left = mid + 1`.
    4. If `nums[mid] > target`, shift search space left: `right = mid - 1`.
  - If target is not found when `left > right`, return `-1`.

---

## 2. Search in Rotated Sorted Array (LeetCode 33)

### Problem Description
There is an integer array `nums` sorted in ascending order (with distinct values). Prior to being passed to your function, `nums` is possibly rotated at an unknown pivot index. Given the array `nums` after the possible rotation and an integer `target`, return the index of `target` if it is in `nums`, or `-1` if it is not in `nums`.

### Conceptual Walkthrough
- **One-Pass Binary Search ($O(\log N)$ time, $O(1)$ space)**:
  - Initialize `left = 0`, `right = nums.length - 1`.
  - While `left <= right`:
    - Calculate `mid`.
    - If `nums[mid] == target`, return `mid`.
    - Determine which half of the array is sorted:
      - **Left half is sorted (`nums[left] <= nums[mid]`)**:
        - Check if `target` lies in the sorted left half: `nums[left] <= target && target < nums[mid]`.
        - If yes, search left: `right = mid - 1`. Otherwise, search right: `left = mid + 1`.
      - **Right half is sorted (`nums[mid] <= nums[right]`)**:
        - Check if `target` lies in the sorted right half: `nums[mid] < target && target <= nums[right]`.
        - If yes, search right: `left = mid + 1`. Otherwise, search left: `right = mid - 1`.

---

## 3. Find Minimum in Rotated Sorted Array (LeetCode 153)

### Problem Description
Given the sorted rotated array `nums` of unique elements, return the minimum element of this array. You must write an algorithm that runs in $O(\log n)$ time.

### Conceptual Walkthrough
- **Modified Binary Search ($O(\log N)$ time, $O(1)$ space)**:
  - Initialize `left = 0`, `right = nums.length - 1`.
  - While `left < right`:
    - Calculate `mid`.
    - Compare `nums[mid]` with `nums[right]`:
      - If `nums[mid] > nums[right]`, it means the pivot point (and the smallest element) lies to the right of `mid`. Thus, set `left = mid + 1`.
      - If `nums[mid] <= nums[right]`, it means the right half is sorted normally, and the smallest element could be `mid` itself or lies to the left of `mid`. Thus, set `right = mid`.
  - When the loop terminates, `left` and `right` will converge to the minimum element. Return `nums[left]`.
