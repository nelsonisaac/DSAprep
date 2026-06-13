# Graphs

## When to use
- Entities (vertices/nodes) connected by relations (edges)
- Map routes, network connectivity, social circles, or course dependencies
- Finding paths, cycles, topological orderings, or connected components
- Grid-based traversal problems (treating 2D cell indices as nodes and adjacent directions as edges)

## Core ideas
- **Representations**: Adjacency Lists (mapping node to lists of its neighbors, e.g. `Map<Integer, List<Integer>>` or `List<Integer>[]`) and Grid Matrices.
- **Visited Tracking**: Crucial to prevent infinite loops in cyclic graphs. Maintain a `HashSet` of visited nodes, or mark cell values as visited in-place for grid problems.
- **Topological Sort (Kahn's / DFS)**: Used for task scheduling with dependencies (Directed Acyclic Graphs).
- **Union-Find (Disjoint Set)**: Excellent for checking if two nodes belong to the same component, or dynamically tracking connected clusters.

## References
- Sean Prashad LeetCode Patterns – Graphs
- NeetCode 150 – Graphs

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Number of Islands | https://leetcode.com/problems/number-of-islands/ | Medium | 🔄 | Flood-fill using recursive DFS/BFS on grid |
| 2 | Clone Graph | https://leetcode.com/problems/clone-graph/ | Medium | 🔄 | Deep copy using Map to prevent duplicate nodes |
| 3 | Max Area of Island | https://leetcode.com/problems/max-area-of-island/ | Medium | 🔄 | Area accumulator DFS/BFS with grid visited marking |
