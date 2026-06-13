# Data Structures & Algorithms (DSA) Patterns

Welcome to your personal DSA Patterns repository! This workspace is designed for structured coding practice. Instead of solving problems randomly, learning through **patterns** allows you to map new, unseen questions to known algorithmic archetypes.

This repository is organized into 12 essential patterns, each containing pattern explanations, classic problem templates, curated practice lists, and starter Java code files.

---

## 📂 Repository Structure

```text
dsa-patterns/
├── README.md                     # This file (course outline and guide)
├── docs/
│   ├── pattern-cheatsheet.md     # Code templates & Big-O for all patterns
│   └── progress-log.md           # Log to track your daily practice progress
└── patterns/
    ├── 01-arrays-strings-hashing/
    ├── 02-two-pointers-sliding-window/
    ├── 03-stack-queue/
    ├── 04-linked-list/
    ├── 05-binary-search/
    ├── 06-trees/
    ├── 07-graphs/
    ├── 08-backtracking/
    ├── 09-dp/
    ├── 10-greedy-intervals/
    ├── 11-heaps-topk/
    └── 12-bit-prefix-math/
```

Each pattern folder under `patterns/` contains:
- `README.md`: Techniques, templates, "when to use" indicators, and a curated tracking table.
- `problems.md`: Deep dives into standard problems with concept breakdowns.
- `src/`: Java starter skeleton files with the standard class/method signatures so you can code and compile solutions locally.

---

## 🗺️ The 12 Patterns Curriculum

| Pattern | Description | Key Algorithms & Data Structures |
|---|---|---|
| **[01. Arrays, Strings & Hashing](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/01-arrays-strings-hashing/README.md)** | Frequency counting, key-value mappings, and prefix calculations. | `HashMap`, `HashSet`, frequency array |
| **[02. Two Pointers & Sliding Window](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/02-two-pointers-sliding-window/README.md)** | Iterating over arrays/lists with multiple indices to optimize nested loops. | Two pointers, Fixed & Variable windows |
| **[03. Stack & Queue](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/03-stack-queue/README.md)** | Managing elements with LIFO/FIFO constraints, and monotonic search. | `Stack`, `Queue`, `Deque`, Monotonic Stack |
| **[04. Linked List](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/04-linked-list/README.md)** | Manipulation of node sequences, fast-and-slow runners. | Dummy node, In-place reversal, Tortoise & Hare |
| **[05. Binary Search](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/05-binary-search/README.md)** | Efficient searching in sorted structures and optimizing search spaces. | Binary Search, Search space reduction |
| **[06. Trees](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/06-trees/README.md)** | Hierarchical structures, recursive traversal, and node depth/height logic. | Binary Trees, BST, DFS (Pre/In/Post-order), BFS |
| **[07. Graphs](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/07-graphs/README.md)** | Relationships, connected components, and shortest path traversals. | Adjacency List, BFS, DFS, Union-Find, Dijkstra |
| **[08. Backtracking](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/08-backtracking/README.md)** | State-space search, permutations, subsets, and constraints validation. | Recursion, Decision trees, Choice-Constraint-Undo |
| **[09. Dynamic Programming](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/09-dp/README.md)** | Breaking down optimization problems into overlapping subproblems. | Memoization (Top-Down), Tabulation (Bottom-Up) |
| **[10. Greedy & Intervals](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/10-greedy-intervals/README.md)** | Making locally optimal choices and sorting intervals. | Interval overlapping, Active interval tracking |
| **[11. Heaps & Top K](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/11-heaps-topk/README.md)** | Dynamically tracking min/max items or elements of rank K. | `PriorityQueue` (Min-heap / Max-heap), Two Heaps |
| **[12. Bit Manipulation & Math](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/patterns/12-bit-prefix-math/README.md)** | Low-level logic operations, math principles, and cumulative sum tracking. | XOR tricks, Bitmasks, Prefix Sums, GCD |

---

## 🛠️ How to Practice with this Repo

1. **Pick a Pattern**: Select a pattern (e.g., `02-two-pointers-sliding-window`).
2. **Read the Theory**: Open that pattern's `README.md` to understand the key ideas, templates, and complexity considerations.
3. **Write Code**: Navigate to `src/` and open the starter skeleton file for a problem. Implement your solution inside the method skeleton.
4. **Compile and Run**: Open your terminal inside the pattern folder, and use `javac` to verify your code compiles:
   ```powershell
   javac src/*.java
   ```
5. **Update Progress**: Record your progress in [progress-log.md](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/docs/progress-log.md). Mark your completed status in the pattern's README table as well.

---

## 💡 Recommended Learning Workflow
1. **Understand first, code second**: Never write a single line of code until you can trace the algorithm on paper using a small test case.
2. **Review your old solutions**: Re-solve "Medium" difficulty questions 1-2 weeks after your first pass to solidify knowledge.
3. **Utilize the Cheatsheet**: Refer to [pattern-cheatsheet.md](file:///c:/Users/nelso/OneDrive/Desktop/Nelson/projects/dsaPrep/dsa-patterns/docs/pattern-cheatsheet.md) for a summary of standard patterns and structures.
