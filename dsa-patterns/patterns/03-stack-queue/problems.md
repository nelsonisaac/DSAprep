# Stack & Queue: Problems Deep-Dive

This file outlines the theoretical conceptual walkthroughs and approaches for key practice problems in the Stack & Queue category.

---

## 1. Valid Parentheses (LeetCode 20)

### Problem Description
Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

### Conceptual Walkthrough
- **Optimal Stack Approach ($O(N)$ time, $O(N)$ space)**:
  - Initialize an empty Character stack.
  - Create a mapping of closing brackets to their corresponding opening brackets: `')' -> '('`, `'}' -> '{'`, `']' -> '['`.
  - Iterate through characters of the string:
    - If it's a closing bracket, pop the top of the stack (if empty, use a dummy value) and verify if it matches the mapping. If not, return `false`.
    - If it's an opening bracket, push it onto the stack.
  - Return `true` if the stack is empty at the end, else `false`.

---

## 2. Evaluate Reverse Polish Notation (LeetCode 150)

### Problem Description
Evaluate the value of an arithmetic expression in Reverse Polish Notation (RPN). Valid operators are `+`, `-`, `*`, and `/`. Each operand may be an integer or another expression.

### Conceptual Walkthrough
- **Stack-Based Evaluation ($O(N)$ time, $O(N)$ space)**:
  - Create an integer stack.
  - Loop through each token in the input:
    - If the token is an operator (`+`, `-`, `*`, `/`), pop the top two numbers from the stack. Notice the order: the first popped is the right operand `b`, and the second popped is the left operand `a`.
    - Perform the operation (`a + b`, `a - b`, `a * b`, `a / b`) and push the result back onto the stack.
    - If the token is a number, parse it to an integer and push it onto the stack.
  - The final remaining number in the stack is the result.

---

## 3. Min Stack (LeetCode 155)

### Problem Description
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
- `push(val)` -- Push element val onto stack.
- `pop()` -- Removes the element on the top of the stack.
- `top()` -- Get the top element.
- `getMin()` -- Retrieve the minimum element in the stack.

### Conceptual Walkthrough
- **Two Stacks Approach ($O(1)$ time per operation, $O(N)$ space)**:
  - Maintain two standard stacks: `mainStack` to hold all values, and `minStack` to track the minimum value at each point of the stack history.
  - **Push**: Push `val` to `mainStack`. For `minStack`, push `min(val, minStack.peek())` (or `val` if `minStack` is empty).
  - **Pop**: Pop from both `mainStack` and `minStack`.
  - **Top**: Return `mainStack.peek()`.
  - **GetMin**: Return `minStack.peek()`.
