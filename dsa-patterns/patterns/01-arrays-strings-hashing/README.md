# Arrays, Strings & Hashing

## When to use
- Counting occurrences of characters or numbers
- Finding duplicates or checking for uniqueness
- Finding pairs or subsets that sum up to a target
- Grouping elements based on shared properties (e.g., anagrams)

## Core ideas
- **Frequency Maps / Arrays**: Use an integer array of size 26 for English letters or a hash map for arbitrary values to store frequencies.
- **Hash Table Lookups**: Retrieve complements (e.g., `target - nums[i]`) in $O(1)$ average time complexity.
- **Key Serialization**: Generate a canonical string or representation for collections that should be grouped together (e.g., sort letters of a word to group anagrams).

## References
- NeetCode 150 – Arrays & Hashing
- Sean Prashad LeetCode Patterns – Arrays & Hashing

## Problem List & Practice Log

| # | Problem | Link | Difficulty | Status | Notes / Takeaway |
|---|---------|------|------------|--------|------------------|
| 1 | Two Sum | https://leetcode.com/problems/two-sum/ | Easy | 🔄 | Complement hashing |
| 2 | Valid Anagram | https://leetcode.com/problems/valid-anagram/ | Easy | 🔄 | Frequency array or map comparison |
| 3 | Group Anagrams | https://leetcode.com/problems/group-anagrams/ | Medium | 🔄 | Sorted string or key hashing |
