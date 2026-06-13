# Heaps & Top K Elements: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Heaps & Top K Elements category.

---

## 1. Kth Largest Element in an Array (LeetCode 215)

### Problem Description
Given an integer array `nums` and an integer `k`, return the `kth` largest element in the array. Note that it is the `kth` largest element in the sorted order, not the `kth` distinct element.

### Conceptual Walkthrough
- **Min-Heap Approach ($O(N \log K)$ time, $O(K)$ space)**:
  - Initialize a Min-Heap: `PriorityQueue<Integer> minHeap = new PriorityQueue<>()`.
  - Loop through each number in `nums`:
    - Offer the number to `minHeap`.
    - If `minHeap.size() > k`, poll the smallest element out.
  - The top element of the heap (`minHeap.peek()`) is the Kth largest element.
- **Quickselect Approach ($O(N)$ average time, $O(1)$ space)**:
  - A selection algorithm based on Quicksort partitioning.
  - Choose a pivot, partition the array around it, and narrow down the search space to the partition containing index `nums.length - k`.

---

## 2. Top K Frequent Elements (LeetCode 347)

### Problem Description
Given an integer array `nums` and an integer `k`, return the `k` most frequent elements. You may return the answer in any order.

### Conceptual Walkthrough
- **Map + Min-Heap on Frequencies ($O(N \log K)$ time, $O(N)$ space)**:
  - Count the frequency of each element using a `HashMap<Integer, Integer>`.
  - Maintain a Min-heap of size $K$ containing the unique elements, sorted by their frequency values:
    `PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b))`.
  - Loop through unique elements in the map key set:
    - Offer element to the heap.
    - If heap size exceeds $K$, poll the least frequent element out.
  - Extract the elements from the heap into an array and return it.
- **Bucket Sort Approach ($O(N)$ time, $O(N)$ space)**:
  - Count frequencies.
  - Create a list array `List<Integer>[] buckets = new List[nums.length + 1]`, where the array index represents the frequency count.
  - Group elements of the same frequency into their corresponding bucket index.
  - Iterate backwards from the largest index bucket to the smallest, collecting elements until we have $K$ elements.

---

## 3. Find Median from Data Stream (LeetCode 295)

### Problem Description
The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values. Design a data structure that supports the following two operations:
- `void addNum(int num)` - Add an integer num from the data stream to the data structure.
- `double findMedian()` - Return the median of all elements so far.

### Conceptual Walkthrough
- **Two Heaps Approach ($O(\log N)$ addition, $O(1)$ lookup, $O(N)$ space)**:
  - Maintain two heaps:
    1. `maxHeap`: Store the smaller half of numbers (Max-heap because we want the largest element of this smaller half).
    2. `minHeap`: Store the larger half of numbers (Min-heap because we want the smallest element of this larger half).
  - **Insertion logic**:
    - Always insert `num` into `maxHeap` first.
    - Balance by pushing `maxHeap.poll()` into `minHeap`.
    - If the size of `minHeap` exceeds `maxHeap`, balance back: push `minHeap.poll()` into `maxHeap`.
    - This ensures `maxHeap` has either equal size to `minHeap` or exactly 1 more element.
  - **Median Calculation**:
    - If `maxHeap.size() > minHeap.size()`, return the top of `maxHeap`.
    - Else, return the average of the tops of both heaps: `(maxHeap.peek() + minHeap.peek()) / 2.0`.
