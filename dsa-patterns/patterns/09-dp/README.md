# Dynamic Programming (DP)

## When to use
- Problems requiring finding an optimal value (maximum/minimum) or counting total ways
- Calculations that can be broken down into nested, overlapping subproblems (e.g. Fibonacci sequence)
- Future decisions depending on the results of past choices

## Core ideas
- **Top-Down (Memoization)**: Solve the problem recursively using a cache (e.g., `int[] memo` or hash map) to save subproblem results, preventing redundant computations.
- **Bottom-Up (Tabulation)**: Build a table (`int[] dp = new int[n]`) starting from base cases, iteratively calculating values up to the target state.
- **State Transition Equation**: Identify the relation between subproblems. E.g., for climbing stairs: `dp[i] = dp[i-1] + dp[i-2]`.
- **Space Optimization**: Often, we only need the last few calculated values (like `prev1` and `prev2`) rather than the entire history table, reducing auxiliary space to $O(1)$.

## References
- Sean Prashad LeetCode Patterns – Dynamic Programming
- NeetCode 150 – 1D & 2D Dynamic Programming

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Climbing Stairs | https://leetcode.com/problems/climbing-stairs/ | Easy | 🔄 | Fibonacci relations, $O(1)$ space |
| 2 | House Robber | https://leetcode.com/problems/house-robber/ | Medium | 🔄 | Choose/Skip state transition |
| 3 | Longest Increasing Subsequence | https://leetcode.com/problems/longest-increasing-subsequence/ | Medium | 🔄 | Iterative $O(N^2)$ or binary search $O(N \log N)$ |
