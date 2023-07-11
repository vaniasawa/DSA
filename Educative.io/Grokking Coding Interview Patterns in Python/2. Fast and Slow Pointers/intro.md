# Fast and Slow Pointers

Use to traverse an iterable data structure at different speeds.
Determine data structure traits, not the values in the data structure itself, using indices in arrays or node pointers in linked lists. 
- Detect cycles in a data structure
- Delete nth node from the end of the list

## Does my Problem Match this Pattern?

Yes, If
1. Either as an intermediate step/final solution, the problem requires identifying -
- The first x% of the elements in a linked list, or
- The element at the k-way point in a linked list
- Kth last element in a linked list
2. Detect a cycle in a linked list/sequence of symbols

No, if
1. The input data cannot be traversed in a linear fashion (not an array, linked list, or string of characters)
2. Problem can be solved with 2 pointers traversing an array of a linked list at the same pace

## Real World Problems
- Symlink verification - Shortcut to another file - There might be loops or cycles where shortcuts point to each other. To avoid such an occurence, a verification utility can be used.
- Compiling an object-oriented program - Cyclic dependencies can lead to errors.
 