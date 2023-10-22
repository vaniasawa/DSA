# Modified Binary Search: Introduction

Classic Binary Search:
- Search a target value in a sorted array/list that support direct addressing (also called random access - O(1))
- Use 3 indices - start, end, mid

Instructions:
- Set the start and end indices to the first and last element, calculate mid
- Compare the target value with the element at mid
- If target value is equal, return
- If target value is greater than mid, then start = mid + 1
- If target value is lesser than mid, then end=mid - 1
- Repeat until target value is found or space is exhausted

Runtime: O(log n)

Now, **Modified Binary Search**:
1. Binary search on a modified array: Array might be sorted and then rotated around some pivot, elements might be modified.
2. Binary search with multiple conditions: When searching for a target satisfying multiple conditions, a modified binary search can be used. Finding a target range instead of a target, or find the leftmost/rightmost occurence of a target value.

Eg.
- Find the first and last position of a target element in a sorted array
- Integer square root of a number


## Does my Problem Match this Pattern?

Yes, if either of these conditions are fulfilled -

1. Problem requires us to find a target value (or first/last occurence) in a sorted array or a sorted list that supports direct addressing
2. Segments of an input array are sorted, even if the whole list does not seem to be sorted at first sight.

No, if any one of these conditions is fulfilled -

1. The input data structure does not support random access.
2. The input data is not sorted according to relevant criteria.
3. The solution does not require us to find a particular value/range of values.

## Real-world problems

- Dictionary: Words that are alphabetically sorted.
- Debugging with minimal support
- Student documents: Given a list of students sorted by their scores on a test, find all students between 40 and 55%