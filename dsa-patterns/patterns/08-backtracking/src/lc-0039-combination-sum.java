import java.util.ArrayList;
import java.util.List;

class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // TODO: Implement recursive backtracking for combinations summing to target.
        // 1. Initialize result list.
        // 2. Call helper backtrack function(index, remainingTarget, currentCombination).
        // 3. Base cases: remainingTarget == 0 (success), remainingTarget < 0 or index == end (fail).
        // 4. Branch 1: Choose candidates[index], recurse on same index (decrement target).
        // 5. Backtrack: Remove choice.
        // 6. Branch 2: Skip candidates[index], recurse on index + 1.
        return new ArrayList<>();
    }
}

