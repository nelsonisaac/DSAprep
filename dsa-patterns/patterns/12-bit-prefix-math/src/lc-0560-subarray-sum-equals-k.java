import java.util.HashMap;
import java.util.Map;

class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // TODO: Implement O(N) map-assisted prefix sum subarray counter.
        // 1. Maintain running prefix sum (sum) and total subarrays count (count).
        // 2. Initialize Map of prefixSum to occurrences count (Map<Integer, Integer>).
        // 3. Put (0, 1) in Map.
        // 4. Loop through elements, add to sum, check if map contains (sum - k), increment count.
        // 5. Update map with current sum frequency.
        return 0;
    }
}

