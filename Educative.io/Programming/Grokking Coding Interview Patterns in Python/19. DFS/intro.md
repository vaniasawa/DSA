# Depth First Search (DFS): Introduction

- Tree is a graph containing the following properties -
1. It is undirected
2. It is cyclic
3. It is a connected graph where any two vertices are connected by exactly one path. 

- Use of nested loops in our tree-related problems
- Implemented recursively

3 main methods of traversal:
1. Preorder (Root, Left, Right)
2. Inorder (Left, Root, Right)
3. Postorder (Left, Right, Root)

O(n) time traversal, as opposed to O(n^2) if you kept restarting from the root node!

Eg. 
1. Determine if a tree is a valid binary search tree - Inorder traversal done correctly
2. Lowest common ancestor of two nodes in a BST

## Does my Problem Match this Pattern?

Yes, if -

1. Solution is near the leaves of the tree
2. Components of the solution are listed along paths from the root to the leaves, and finding the optimal solutions requires traversal along these paths

No, if any one of these conditions is fulfilled -

1. Input not in the form of a tree, or cost of transforming into a tree is too high
2. Solution requires traversing tree one level at a time

## Real-world problems

- Find products in a price range: Convert the prices of all products into a binary search tree, and perform a preorder traversal.
- Find Routes: Between start and destination point
- Solving Mazes: Finding the path out of a maze.
