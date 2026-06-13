import java.util.ArrayList;
import java.util.List;

class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        // TODO: Implement recursive backtracking to find all subsets.
        // 1. Initialize a result list of lists.
        // 2. Call a helper backtrack function starting at index 0.
        // 3. In backtrack, append current list copy to result, loop from start to end.
        // 4. Add element, recurse with i + 1, backtrack.
        return new ArrayList<>();
    }
}

