# Dynamic Programming: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Dynamic Programming category.

---

## 1. Climbing Stairs (LeetCode 70)

### Problem Description
You are climbing a staircase. It takes `n` steps to reach the top. Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?

### Conceptual Walkthrough
- **Optimal Bottom-Up Tabulation ($O(N)$ time, $O(1)$ space)**:
  - Base cases: 1 way to climb 1 step, 2 ways to climb 2 steps.
  - For any step `i`, the number of ways to reach it is the sum of ways to reach step `i-1` and step `i-2`: `dp[i] = dp[i-1] + dp[i-2]`.
  - Since we only need the values of the previous two steps to compute the current one, we can maintain two variables `prev2` and `prev1`, updating them dynamically as we loop from 3 to `n`.
  - This reduces the space complexity from $O(N)$ to $O(1)$.

---

## 2. House Robber (LeetCode 198)

### Problem Description
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night. Given an integer array `nums` representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

### Conceptual Walkthrough
- **Optimal Bottom-Up DP ($O(N)$ time, $O(1)$ space)**:
  - For each house `i`, you have two choices:
    1. Rob house `i`: You get the current house money `nums[i]` plus the max money robbed up to house `i-2`: `rob = nums[i] + dp[i-2]`.
    2. Skip house `i`: The max money is the same as max money robbed up to house `i-1`: `skip = dp[i-1]`.
  - Transition: `dp[i] = max(nums[i] + dp[i-2], dp[i-1])`.
  - Again, we can optimize space to $O(1)$ by keeping two variables representing `dp[i-2]` and `dp[i-1]`.

---

## 3. Longest Increasing Subsequence (LeetCode 300)

### Problem Description
Given an integer array `nums`, return the length of the longest strictly increasing subsequence.

### Conceptual Walkthrough
- **Bottom-Up DP Approach ($O(N^2)$ time, $O(N)$ space)**:
  - Create a `dp` array where `dp[i]` represents the length of the LIS ending at index `i` (initialized to `1` because each element is a subsequence of length 1).
  - Use nested loops: for each element `i`, iterate through all previous elements `j` from `0` to `i-1`.
  - If `nums[i] > nums[j]`, then `dp[i] = max(dp[i], dp[j] + 1)`.
  - The answer is the maximum value in the `dp` array.
- **Binary Search + DP Approach ($O(N \log N)$ time, $O(N)$ space)**:
  - Maintain an active subsequence array `tails` where `tails[i]` stores the smallest tail value of all increasing subsequences of length `i+1` found so far.
  - For each number in `nums`, use binary search to find its position in `tails`:
    - If it's larger than all elements in `tails`, append it.
    - Otherwise, replace the first element in `tails` that is $\ge$ than it.
  - The length of `tails` at the end is the length of the LIS.
