# Graphs: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Graphs category.

Also includes the common `Node` structure definition.

---

## 📌 Common Data Structure: Node (Graph)

```java
import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
```

---

## 1. Number of Islands (LeetCode 200)

### Problem Description
Given an `m x n` 2D binary grid `grid` which represents a map of `'1'`s (land) and `'0'`s (water), return the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.

### Conceptual Walkthrough
- **Flood Fill BFS/DFS ($O(R \cdot C)$ time, $O(R \cdot C)$ space)**:
  - Iterate through every cell in the grid using nested loops:
    - If the cell is `'1'` (land):
      - We found a new island! Increment our island counter.
      - Start a BFS or DFS search from this cell to explore all connected land cells.
      - Mark each visited land cell as `'0'` (or some other value) to prevent double counting.
  - Return the island count.

---

## 2. Clone Graph (LeetCode 133)

### Problem Description
Given a reference of a node in a connected undirected graph, return a deep copy (clone) of the graph.

### Conceptual Walkthrough
- **Map-Assisted BFS/DFS ($O(V + E)$ time, $O(V)$ space)**:
  - Keep a `HashMap<Node, Node>` mapping original nodes to their corresponding cloned nodes.
  - If a node is already in the map, return its clone.
  - If not:
    1. Create a clone: `Node clone = new Node(node.val)`.
    2. Add `(node, clone)` to the map.
    3. Iterate through `node.neighbors`: clone each neighbor recursively and add it to `clone.neighbors`.
  - Return the cloned root.

---

## 3. Max Area of Island (LeetCode 695)

### Problem Description
You are given an `m x n` binary matrix `grid`. An island is a group of `1`s (representing land) connected 4-directionally. The area of an island is the number of cells with a value `1` in the island. Return the maximum area of an island in `grid`. If there is no island, return `0`.

### Conceptual Walkthrough
- **DFS Area Accumulator ($O(R \cdot C)$ time, $O(R \cdot C)$ space)**:
  - Iterate through all cells. If a cell is `1`, trigger a recursive DFS.
  - The DFS function returns the area of the island:
    - Base Case: If out of boundaries or the cell value is `0` (or visited), return `0`.
    - Mark the cell as `0` to count it as visited.
    - Recursively sum the areas of adjacent neighbors: `1 + dfs(r+1, c) + dfs(r-1, c) + dfs(r, c+1) + dfs(r, c-1)`.
  - Track the maximum area returned by any DFS run.
