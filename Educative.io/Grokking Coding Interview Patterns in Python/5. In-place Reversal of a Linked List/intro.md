# In-Place Reversal of a Linked List

- Allow us to reverse a linked list without any additional memory (using only given nodes)
- Iterate over the linked list, and keep track of current node, next node, and previous node.
- Naive Approach - Nested Loops (O(n^2)). In-Place - O(n)

Other examples - 
1. Reverse a linked list in place
2. Reverse the second half of a linked list in place.

## Does my Problem Match this Pattern?

Yes, If both these conditions are satisfied

1. The problem requires reversing a given linked list, either as the end goal or as an intermediate step of the solution.
2. Modifications must be made in place.

No, if

1. Input data is not in the form of a linked list.
2. We are instructed to use additional memory.
3. We aren't allowed to modify the input linked list.

## Real-world problems

- Stocks - A total of N stock transactions need to be carried out by K brokers. We need to assign transactions to each broker that need to be carried out in the same order in which they arrived.
- E-commerce - A list of products is arranged such that the first half is in ascending order based on prices and the second half is in ascending order based on popularity. A list of products needs to be displayed on a landing page in pairs of price and popularity such that the first product is cheaper and the second is the most popular.