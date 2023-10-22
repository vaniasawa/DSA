# Custom Data Structures: Introduction

- Can be a modified version of an existing data structure

Most common data structures -
- Array - Stores a fixed size collection of elements of the same data type, elements are stored in a contiguous block of memory, elements can be accessed by O(1)
- Linked List - Used to implement stacks, queues, graphs etc; Dynamic in nature - memory only allocated when needed; Random access is not supported
- Hash Map - Access by Key, O(1) time for access, Hash Maps can store values of more than one data type
- Trees - Seen as undirected graphs with no cycles, naturally support recursion

Eg.
- Custom stack with getMin() in O(1) complexity


## Does my Problem Match this Pattern?

Yes, if either of these conditions is fulfilled -

1. Customizing an existing data structure, that is, adding a feature to it or modifying an existing feature
2. Combining one or more data structures to solve the problem efficiently (LRU Cache)

No, if any one of these conditions is fulfilled -

1. Existing data structures can be used to solve the problem more efficiently

## Real-world problems

- Keeping various states of a games
- Used in search engines 
- Data in a tabular format - Accessing data can be made much more efficient by tweaking existing data structures