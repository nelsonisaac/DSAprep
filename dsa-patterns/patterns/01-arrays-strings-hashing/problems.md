# Arrays, Strings & Hashing: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Arrays, Strings & Hashing category.

---

## 1. Two Sum (LeetCode 1)

### Problem Description
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

### Conceptual Walkthrough
- **Naive Approach ($O(N^2)$ time, $O(1)$ space)**: Run nested loops checking all pairs $(i, j)$ where $i \neq j$.
- **Optimal Approach ($O(N)$ time, $O(N)$ space)**: Use a Hash Map to store the elements we've seen so far and their indices.
  - As we iterate through `nums`, calculate the `complement = target - nums[i]`.
  - Check if the `complement` exists in our Hash Map. If it does, we found our pair! Return `[map.get(complement), i]`.
  - If it doesn't exist, insert `nums[i]` and its index `i` into the map and continue.

---

## 2. Valid Anagram (LeetCode 242)

### Problem Description
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

### Conceptual Walkthrough
- **Sorting Approach ($O(N \log N)$ time, $O(N)$ or $O(1)$ space depending on sort utility)**: Sort both strings and compare if they are equal.
- **Optimal Frequency Count ($O(N)$ time, $O(1)$ auxiliary space)**:
  - If strings have different lengths, return `false` immediately.
  - Since standard LeetCode problems assume lowercase English alphabets, we can use an integer array of size 26 (`int[] counts = new int[26]`).
  - Iterate through both strings: increment the index corresponding to the character in `s` (`counts[s.charAt(i) - 'a']++`) and decrement for `t` (`counts[t.charAt(i) - 'a']--`).
  - Finally, check if all frequencies in `counts` are 0. If any element is non-zero, return `false`.

---

## 3. Group Anagrams (LeetCode 49)

### Problem Description
Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

### Conceptual Walkthrough
- **Sorting as Key ($O(N \cdot K \log K)$ time where $K$ is max string length, $O(N \cdot K)$ space)**:
  - Use a `HashMap<String, List<String>>` where the key is the sorted version of a string, and the value is a list of strings that sort to this key.
  - For each string in `strs`:
    1. Convert it to a char array, sort it, and convert it back to a string (this is the key).
    2. Add the original string to the corresponding list in the hash map.
  - Return the values of the hash map.
- **Frequency Array as Key ($O(N \cdot K)$ time, $O(N \cdot K)$ space)**:
  - Instead of sorting, we can generate a unique signature key representing the frequency of each character (e.g., `#1#0#2...#0` for a string with 1 'a', 0 'b', 2 'c', etc.) and use it as the hash map key.
