import java.util.ArrayList;
import java.util.List;

class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // TODO: Implement O(N) three-stage linear scan.
        // 1. Add all intervals ending before newInterval starts.
        // 2. Merge all overlapping intervals with newInterval.
        // 3. Add the merged newInterval.
        // 4. Add all remaining intervals starting after newInterval ends.
        return new int[0][0];
    }
}

