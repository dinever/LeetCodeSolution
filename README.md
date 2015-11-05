# Leet Code Solution in Java

**Inspired by [Xi Chen](https://github.com/aaron-xichen/LeetCodeSolution)** 

1. **Two Sum**

    Time Complexity: O(n), Space Complexity: O(n).
    
    The main idea is to use a map to store every element we seen, and for every `nums[i]` we check wether there is a 
    corresponding number `target - nums[i]` stored in the map. If so, get the value `j` by the key `target - nums[i]`, 
    which is the index of the corresponding number, then return `{i + 1, j + 1}`.