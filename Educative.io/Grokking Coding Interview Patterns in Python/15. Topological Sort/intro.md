# Topological Sort: Introduction

- Find valid orderings of elements that have dependencies on, or priority over each other.
- Scheduling and grouping problems have prerequisites or dependencies 
- First step - Converting a problem into a directed graph


## Does my Problem Match this Pattern?

Yes, if either of these conditions is fulfilled -

1. A partial ordering of the given elements is required
2. The problem asks you to find an ordering of elements based on some dependency rules between them.

No, if any one of these conditions is fulfilled -

1. A total ordering of the given elements is required.
2. Problem cannot be converted into a graph
3. Corresponding graph is not a tree

## Real-world problems

- Process Scheduling in a computer system
- Scheduling courses at an academic institution