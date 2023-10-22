# Breadth First Search (DFS): Introduction

- Search at the root node + move down level by level, exploring adjacent nodes at level k+1

Eg.
1. Print all the nodes of a perfect binary tree in a top-down/bottom-up manner.

## Does my Problem Match this Pattern?

Yes, if -

1. Solution is near the root of the tree
2. The solution dictates traversing the tree one level at a time, for example, to find the level order traversal of the nodes of a tree, or a variant of this ordering.

No, if any one of these conditions is fulfilled -

1. The tree being searched is very wide.
2. We have reason to believe that the solution is near the leaves of the tree.

## Real-world problems

- Traversind DOM Tree 1: HTML Tree Structure, Each tree level can have any number of nodes depending upon the number of nested HTML Tags
- Traversing DOM Tree 2: Add a queue at each level of the DOM structure, hence optimising for space