# Union Find: Introduction

- Group elements into sets, based on a specific property.
- Each set is non-overlapping.
- Pattern uses a disjoint set data structure such as an array, to keep track of which set each element belongs to. 
- Each set forms a tree data structure, and has a representative element that resides at the root of the tree. Every element in this tree maintains a pointer to its parent.

Actions:
- find(x): Find the representative of the set that contains x
- union(x, y): Merge the sets of x and y into one

Worse Case Time-Complexity: O(n) - Might have to traverse the entire tree to find the representative of an element.

Improve the union-find pattern through an optimisation - **Union by rank**
- Maintain a rank for each tree
- When merging two trees with the union method, attach a tree of lower rank to a tree of higher rank
- Ensures that when two trees are merged, each element in the merged tree has the shortest possible path to the root.
- O(log n) worst case

Examples - https://www.educative.io/courses/grokking-coding-interview-patterns-python/union-find-introduction

Another optimisation - **Path Compression**
- On each find operation on a node of a tree, we update the parent of that node to point directly to the root

Both the optimisations bring down the time complexity to O(\alpha * n) where \alpha is a small amortised time complexity - inverse Ackerman function.

## Does my Problem Match this Pattern?

Yes, if any of these conditions is fulfilled -

1. The problem requires arranging elements with a certain property into groups, or, to use graph terminology, into connected components.
2. Elements represented as separate sets initially where we have to combine pairs of sets or find whether two elements belong to the same set or not.
3. The problem data is best organized in the form of a graph, yet the data has not been provided in the form.

No, if any one of these conditions is fulfilled -

1. Does not require considering the input data as a graph
2. A graph has already been provided in the form of an adjacency list/matrix, and no new edges need to be added, so it would be more efficient to use either breadth-first or depth-first search.

## Real-world problems

- Image Segementation through region agglomeration: Divide a digital image into regions of similar colors. Initialise each pixel to be its own region and then merge the two adjacent regions that have the most similar color. Union find lets us know which region each pixel belongs to and updates that information when two regions are merged.
- Image Manipulation: Image editing applications often use union find to locate different objects within the image. This allows for several functionalities, such as to grab different objects in an image, select regions by color, differentiate between the background and the image etc.
- Network Connectivity: Connect devices to each other and find out if there is a path connecting one device to another.
- Percolation: Identify the percolation threshold of a liquid through a filter
- Hex (Game):  Make connections between pieces of the same color to identify whether a player has won.