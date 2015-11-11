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
    
3. **[Longest Substring Without Repeating Characters](https://github.com/dinever/LeetCodeSolution/blob/master/src/LongestSubstringWithoutRepeatingCharacters.java)**

    Time Complexity: O(n), Space Complexity: O(1);
    
    The idea is to use a hash map to track the index of the character we recently met. When we scan the string, we can
    use the hash map to check whether we have met this character. If so, we get its index and update our `start` index.

4. **[Median of Two Sorted Arrays](https://github.com/dinever/LeetCodeSolution/blob/master/src/MedianOfTwoSortedArrays.java)**

    Time Complexity: O(log(n) + log(m)), Space Complexity: O(1);
    
    By the reason that the median of the two arrays should be located between the median of `nums1` and the median of
    `nums2`, a good approach is to compare the median of `nums1` and `nums2`, if the median of `nums1` is greater than
    the median of `nums2`, then we can just drop the first part of `nums2` and go on recursively. 

5. **[Longest Palindromic Substring](https://github.com/dinever/LeetCodeSolution/blob/master/src/LongestPalindromicSubstring.java)**

    Space Complexity: O(1);
    
    Scan over the input string. For every character, consider it as the middle character of a palindromic string(**Note:**
    it can be an odd length string as well as an even length string, so it should be considered separately), then find
    the longest palindromic string in that position, and compare the length of it with the longest palindromic substring
    we have found.

6. **[ZigZag Conversion](https://github.com/dinever/LeetCodeSolution/blob/master/src/ZigZagConversion.java)**

    Time Complexity: O(n), Space Complexity: O(n);
    
    The key to solve this problem is to calculate the position of every element in the ZigZag pattern(Note that the index starts from 0):
 
    
    ```
    0                                       2*row - 2
    
    1                             2*row - 3 2*row
    
    2                   2*row - 4           2*row + 1
    
    ...             ...                     ...
    
    row - 2 row + 1                         3*row - 2
    
    row - 1                                 3*row - 3
    ```
    
    Then the problem becomes easy, we can just scan over the rows. And for every row, we scan the elements in this row
    using the result of the pattern above.

7. **[Reverse Integer](https://github.com/dinever/LeetCodeSolution/blob/master/src/ReverseInteger.java)**

    The tricky part of this problem is to handle overflow cases. Before adding the last digit to the return value(`ret * 10 + x`), 
    we have to check whether the answer of `ret * 10 + x` will overflow. We achieved it by this way:
    
    - If the answer is a positive number:
        - If `ret > Integer.MAX_VALUE / 10`, it would cause overflow.
        - If `ret == Integer.MAX_VALUE / 10`, but `x > Integer.MAX_VALUE % 10`, the overflow happens too.
    - If the answer is a negative number:
        - If `ret < Integer.MIN_VALUE / 10`, it would cause overflow.
        - If `ret == Integer.MIN_VALUE / 10`, but `x < Integer.MIN_VALUE % 10`, the overflow happens too.

9. **[Palindrome Number](https://github.com/dinever/LeetCodeSolution/blob/master/src/PalindromeNumber.java)**

    Time Complexity: O(n), Space Complexity: O(1);

    We reverse this integer but skip the highest digit to prevent overflow.

    For example, if we have `54345`, then we reverse it and get `5434`(Skip the highest digit), then we compare 
    `54345 / 10` with `5434` and compare the last remaining digit `x = 5`(which we skipped) with the lowest digit of the
    original integer `54345 % 10`. If they all match, then we can say it is a Palindrome Number.

10. **[Regular Expression Matching](https://github.com/dinever/LeetCodeSolution/blob/master/src/PalindromeNumber.java)**

    Time Complexity: O(n*m), Space Complexity: O(n);

    This problem is a little bit difficult. We use dynamic programming to solve it. We use an array of boolean `match`.
    Every element of `match` is corresponding to an element in the input string to be matched. For example:
    `match[5] == true` stands for that every element after and including `s[5]` matches the regular expression.
