# Top K Elements - Introduction

- Find some specific k number of elements from the given data, with optimum time complexity
- Can be top/smallest/most/least frequent k elements - Normally will be sorting + O(k), but instead you can do this in O(nlogk)
- Best data structure: **Heaps**

Pattern for solving:

1. Insert the first k elements from the set of elements into a min-heap or max-heap
2. Iterate through the rest of the elements - 
    - For min-heap, if you find the larger element, remove the top and insert the larger element
    - For max-heap, if you find the smaller element, remove the top (largest number) and insert the smaller element


## Does my Problem Match this Pattern?

Yes, if both these conditions are fulfilled -

1. We need to find the largest, smallest, most frequent, or least frequent subset of elements in an unsorted list (not ALL elements!)
2. This may be the requirement of the final solution, or it may be necessary as an intermediate step toward the final solution.

No, if any one of these conditions is fulfilled -

1. The input data structure does not support random access.
2. The input data is already sorted
3. If only 1 extreme value is required, then problem can be solved in O(n)

## Real-world problems

- Uber: Select at least the n-drivers  within the user's vicinity, avoiding the ones that are too far away
- Stocks: Given the set of IDs of brokers, determine the top K broker's performance with frequently repeated IDs in a dataset


