Techniques - 

1. Two Pointer
- Start one pointer at the first index 0 and last index input.length - 1
- Use a while loop until the pointers are equal to each other
- At each iteration, move the pointers till they are equal to each other.
- At left pointer == right pointer, you have carried out all the possible scenarios and need to break.

Runtime - O(n)

Samples Qs.
- Given a string s, return true if it is a palindrome and false otherwise.
- Given a sorted array of unique integers and a target integer, return true if there exists a pair of numbers that sum to target, and false otherwise (Similar to the two-sum problem)

2. Two Pointer for 2 iterables
- Create two pointers, one for each iterable.
- Start at index = 0 for both.
- Iterate till one of the pointers reaches the end of the iterable, based on the logic.
- For the other iterable, iterate through the remainder of the elements.

Runtime - O(n+m)

Samples Qs.
- Given two sorted integer arrays arr1 and arr2, return a new array that combines both of them
- Given two strings, return true if one is a subsequence of another, or false. (https://leetcode.com/problems/is-subsequence/)

3. Two pointers for a different scenario - Sliding Window
- Subarray is a contiguous section of an array, described by a left and right bound
- What makes a subarray valid - (1) Constraint metric + (2) Numeric restriction on the constraint metric
- Problem will ask you to find valid subarrays - Find the BEST valid subarray

Sample Qs.
- Find the longest subarray with a sum <= k
- Find the longest substring that has at most one '0'
- Fine the number of subarrays with a product < k

- Initially, look at the first subarray left=right=0
- Expand the size of the window by incrementing right
- If subarray becomes invalid, increment left to shrink the window

Sample Qs.
- Given an array of positive integers nums and an integer k, find the length of the longest subarray whose sum is <= k.
- Given a binary substring s, you may choose up to one 0 and flip it to a 1. What is the length of the longest substrings achievable that contains only 1?

For # of subarrays -
- For a fixed right index, the number of subarrays for array (left, right) = right - left + 1 (Possible subarrays will be (left, right), (left+1, right), (left+2, right) .. (right, right))

For fixed window size - 
- Once you have a fixed window of size k, to add an element to index i, you remove the element at index i-k
