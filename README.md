# Leet Code Solution in Java

**Inspired by [Xi Chen](https://github.com/aaron-xichen/LeetCodeSolution)** 

1. **[Two Sum](https://github.com/dinever/LeetCodeSolution/blob/master/src/TwoSum.java)**

    Time Complexity: O(n), Space Complexity: O(n).
    
    The main idea is to use a map to store every element we seen, and for every `nums[i]` we check wether there is a 
    corresponding number `target - nums[i]` stored in the map. If so, get the value `j` by the key `target - nums[i]`, 
    which is the index of the corresponding number, then return `{i + 1, j + 1}`.

2. **[AddTwoNumbers](https://github.com/dinever/LeetCodeSolution/blob/master/src/AddTwoNumbers.java)**

    Time Complexity: O(n), Space Complexity: O(n);
    
    This problem is rather easy. It focuses more on operations on linked lists. Just scan over the two linked list and
    add each other together, remember to keep a carry bit and check the boundary conditions.