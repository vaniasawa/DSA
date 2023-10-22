# K-way Merge

Pattern for solving:

1. Insert the first element of each array in a min-heap.
2. Next, remove the smallest element from the heap and add it to the merged array.
3. Keep track of which array each element comes from.
4. Then, insert the next element of the same array into the heap.
5. Repeat steps 2 to 4 to fill the merged array in sorted order.

## Does my Problem Match this Pattern?

Yes, if both these conditions are fulfilled -

1. Data Structure - Sorted Array, Sorted rows/columns of a Matrix that need to be merged
2. Problem asks to find the kth largest/smallest element in a set of sorted arrays or linked list

No, if any one of these conditions is fulfilled -

1. Data structure is not an array or linked list
2. Data is not sorted, OR it's sorted but not according to the criteria relevant to solving the problem

## Real-world problems

- Merge tweets in a twitter feed in chronological order
- External sorting procedures - When an algorithm is processing a huge amount of data, it needs to repeatedly fetch it from an external storage, because RAM capacity is fixed.