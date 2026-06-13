# DSA Patterns Cheatsheet

A quick reference guide featuring the core templates, time complexities, and typical usage signals for the 12 primary DSA patterns.

---

## 1. Sliding Window (Variable Size)
Use for finding the longest/shortest subarray/substring matching a condition.

### Java Template
```java
public int slidingWindow(int[] nums) {
    int left = 0;
    int ans = 0;
    // state initialization (e.g., sum, hash map)

    for (int right = 0; right < nums.length; right++) {
        // 1. Add right element to state
        // state.add(nums[right]);

        // 2. Shrink window from the left until condition is valid again
        while (/* window is invalid */) {
            // state.remove(nums[left]);
            left++;
        }

        // 3. Update answer
        ans = Math.max(ans, right - left + 1);
    }
    return ans;
}
```

---

## 2. Two Pointers (From Ends)
Use for sorted arrays, palindrome checks, or finding pairs.

### Java Template
```java
public int[] twoPointers(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        int currentSum = arr[left] + arr[right];
        if (currentSum == target) {
            return new int[]{left, right};
        } else if (currentSum < target) {
            left++;
        } else {
            right--;
        }
    }
    return new int[]{-1, -1};
}
```

---

## 3. Fast and Slow Pointers (Linked List Cycle)
Use for cycle detection or finding the middle node of a linked list.

### Java Template
```java
public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            return true; // Cycle detected
        }
    }
    return false;
}
```

---

## 4. Binary Search
Use when the search space is sorted or has a monotonic property.

### Java Template
```java
public int binarySearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2; // Avoid overflow
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1;
}
```

---

## 5. Breadth-First Search (BFS - Tree/Graph)
Use for shortest path in unweighted graphs or level-order traversal.

### Java Template
```java
public void bfs(Node root) {
    if (root == null) return;
    Queue<Node> queue = new LinkedList<>();
    Set<Node> visited = new HashSet<>(); // Essential for graphs

    queue.offer(root);
    visited.add(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        for (int i = 0; i < levelSize; i++) {
            Node curr = queue.poll();
            // Process node curr

            for (Node neighbor : curr.neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }
}
```

---

## 6. Depth-First Search (DFS - Tree/Graph)
Use for exhaustive search, connectivity, pathfinding, or structural tree questions.

### Java Template
```java
public void dfs(Node node, Set<Node> visited) {
    if (node == null || visited.contains(node)) return;
    visited.add(node);
    
    // Process node here

    for (Node neighbor : node.neighbors) {
        dfs(neighbor, visited);
    }
}
```

---

## 7. Backtracking
Use for generating subsets, permutations, combinations, or solving puzzles (N-Queens).

### Java Template
```java
public void backtrack(int start, List<Integer> current, List<List<Integer>> result, int[] nums) {
    // 1. Base case / Goal reached
    if (/* condition */) {
        result.add(new ArrayList<>(current)); // Make a copy
        return;
    }

    for (int i = start; i < nums.length; i++) {
        // 2. Choose
        current.add(nums[i]);

        // 3. Explore
        backtrack(i + 1, current, result, nums);

        // 4. Undo (Backtrack)
        current.remove(current.size() - 1);
    }
}
```

---

## 8. Monotonic Stack
Use for finding the "next greater element" or "previous smaller element".

### Java Template
```java
public int[] nextGreaterElement(int[] nums) {
    int[] result = new int[nums.length];
    Stack<Integer> stack = new Stack<>(); // Stores indices

    for (int i = nums.length - 1; i >= 0; i--) {
        // Maintain monotonic property (increasing stack elements)
        while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
            stack.pop();
        }
        result[i] = stack.isEmpty() ? -1 : nums[stack.peek()];
        stack.push(i);
    }
    return result;
}
```

---

## 9. Top K Elements (Heap / PriorityQueue)
Use for tracking the largest, smallest, or most frequent K elements.

### Java Template
```java
public List<Integer> topK(int[] nums, int k) {
    // Min-heap to keep the K largest elements
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for (int num : nums) {
        minHeap.offer(num);
        if (minHeap.size() > k) {
            minHeap.poll(); // Keep only K largest elements
        }
    }

    return new ArrayList<>(minHeap);
}
```

---

## 10. Merge Intervals
Use for scheduling, overlap detection, or combining overlapping ranges.

### Java Template
```java
public int[][] mergeIntervals(int[][] intervals) {
    if (intervals.length <= 1) return intervals;

    // 1. Sort intervals by start time
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    List<int[]> merged = new ArrayList<>();
    int[] currentInterval = intervals[0];
    merged.add(currentInterval);

    for (int[] nextInterval : intervals) {
        int currentEnd = currentInterval[1];
        int nextStart = nextInterval[0];
        int nextEnd = nextInterval[1];

        if (currentEnd >= nextStart) { // Overlap
            currentInterval[1] = Math.max(currentEnd, nextEnd); // Merge
        } else {
            currentInterval = nextInterval;
            merged.add(currentInterval);
        }
    }
    return merged.toArray(new int[merged.size()][]);
}
```

---

## 📊 Summary of Big-O Complexities

| Pattern | Average Time Complexity | Average Space Complexity | Standard Data Structure |
|---|---|---|---|
| **Arrays & Hashing** | $O(N)$ | $O(N)$ | `HashMap` / `HashSet` |
| **Two Pointers** | $O(N)$ | $O(1)$ | Array |
| **Sliding Window** | $O(N)$ | $O(1)$ or $O(K)$ | Array / hash map state |
| **Fast & Slow Pointers** | $O(N)$ | $O(1)$ | Linked List |
| **Stack & Queue** | $O(N)$ | $O(N)$ | Stack, Queue, Deque |
| **Binary Search** | $O(\log N)$ | $O(1)$ | Array (Sorted) |
| **Trees** | $O(N)$ | $O(H)$ (Height of tree) | TreeNode, Recursion stack |
| **Graphs** | $O(V + E)$ | $O(V)$ | Adjacency list, Queue, Visited Set |
| **Backtracking** | $O(K^N)$ (exponential) | $O(N)$ (recursion depth) | Recursion stack, List |
| **Dynamic Programming** | $O(N \cdot M)$ | $O(N \cdot M)$ or $O(N)$ | DP Table / Memoization Array |
| **Greedy & Intervals** | $O(N \log N)$ (sorting) | $O(N)$ or $O(1)$ | Sorting, Array |
| **Heaps & Top K** | $O(N \log K)$ | $O(K)$ | `PriorityQueue` |
| **Bit Manipulation** | $O(1)$ or $O(\text{bits})$ | $O(1)$ | Integer / Bitmask |
