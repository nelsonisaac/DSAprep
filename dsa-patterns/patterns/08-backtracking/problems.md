# Backtracking: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Backtracking category.

---

## 1. Subsets (LeetCode 78)

### Problem Description
Given an integer array `nums` of unique elements, return all possible subsets (the power set). The solution set must not contain duplicate subsets. Return the solution in any order.

### Conceptual Walkthrough
- **Recursive Backtracking ($O(2^N \cdot N)$ time, $O(N)$ space)**:
  - We can construct subsets by deciding for each element whether to include it or exclude it.
  - Recursion function signature: `backtrack(int index, List<Integer> current, List<List<Integer>> result, int[] nums)`.
  - At each index step:
    1. Base case: If `index == nums.length`, we've made decisions for all elements. Add a copy of `current` to `result`, then return.
    2. Decision 1: Include `nums[index]`. Add it to `current`, call `backtrack(index + 1, current, result, nums)`, and then remove it (backtrack).
    3. Decision 2: Exclude `nums[index]`. Just call `backtrack(index + 1, current, result, nums)`.

---

## 2. Permutations (LeetCode 46)

### Problem Description
Given an array `nums` of distinct integers, return all the possible permutations. You can return the answer in any order.

### Conceptual Walkthrough
- **Permutations via Choice loop ($O(N! \cdot N)$ time, $O(N)$ space)**:
  - Recursion function: `backtrack(List<Integer> current, List<List<Integer>> result, int[] nums)`.
  - Base case: If `current.size() == nums.length`, we've built a full permutation. Add a copy of `current` to `result` and return.
  - Iteration loop: Loop through each number in `nums`.
    - If `current.contains(num)`, skip it (since numbers are distinct and we can't reuse them).
    - Otherwise:
      1. Add `num` to `current`.
      2. Recurse: `backtrack(current, result, nums)`.
      3. Backtrack: Remove `num` from `current`.

---

## 3. Combination Sum (LeetCode 39)

### Problem Description
Given an array of distinct integers `candidates` and a target integer `target`, return a list of all unique combinations of `candidates` where the chosen numbers sum to `target`. You may return the combinations in any order. The same number may be chosen from `candidates` an unlimited number of times.

### Conceptual Walkthrough
- **Optimal Decision Tree ($O(2^{\text{target}} \cdot \text{target})$ or $O(N^{\text{target}})$ worst case, $O(\text{target})$ space)**:
  - Recursion function: `backtrack(int index, int remainingTarget, List<Integer> current, List<List<Integer>> result, int[] candidates)`.
  - Base Cases:
    - If `remainingTarget == 0`, we found a valid combination. Add copy of `current` to `result` and return.
    - If `remainingTarget < 0` or `index == candidates.length`, it's invalid. Return.
  - Decision branches:
    - Branch 1: Include `candidates[index]` (and keep the same index because we can reuse the element unlimited times).
      - Add `candidates[index]` to `current`.
      - Recurse: `backtrack(index, remainingTarget - candidates[index], current, result, candidates)`.
      - Backtrack: Remove `candidates[index]` from `current`.
    - Branch 2: Skip `candidates[index]` (move to next index).
      - Recurse: `backtrack(index + 1, remainingTarget, current, result, candidates)`.
	  
> [!NOTE]
> Sorting the candidates beforehand can help prune search branches early (e.g. if `remainingTarget - candidates[index] < 0`, break the loop).
