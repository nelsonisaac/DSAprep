# Backtracking

## When to use
- Finding all combinations, permutations, subsets, or paths
- Solving search-space puzzles (e.g. Sudoku, N-Queens, Word Search)
- Evaluating decisions where you need to check all potential options and undo choices if they violate constraints

## Core ideas
- **State-Space Tree**: Backtracking is a systematic traversal of a decision tree.
- **Recursive Template**:
  1. **Base Case / Goal**: If the state satisfies our goal, add a copy of the current state to the results.
  2. **Loop Candidates**: Iterate over all available choices at the current state.
  3. **Validate**: If choice is invalid, skip it.
  4. **Make Choice / Recurse**: Add choice to state, call the recursive function.
  5. **Undo Choice (Backtrack)**: Remove the choice from the state to restore the previous state before the next iteration.

## References
- Sean Prashad LeetCode Patterns – Backtracking
- NeetCode 150 – Backtracking

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Subsets | https://leetcode.com/problems/subsets/ | Medium | 🔄 | Include / Exclude decision tree |
| 2 | Permutations | https://leetcode.com/problems/permutations/ | Medium | 🔄 | Swapping or tracking visited elements |
| 3 | Combination Sum | https://leetcode.com/problems/combination-sum/ | Medium | 🔄 | Multi-use element index recurrence |
