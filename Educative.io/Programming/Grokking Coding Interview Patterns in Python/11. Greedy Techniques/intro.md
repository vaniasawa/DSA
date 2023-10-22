# Greedy Techniques: Introduction

- Making a locally optimal choice in the hope that it leads to a globally optimal solution
- Used to solve optimisation problems
- Recursively construct a solution from the smallest possible parts
- You can also get stuck in a local optima!

Eg.
- Loading maximum containers in a cargo
- Graph coloring - So that no 2 adjacent vertices are colored using the same color, and minimum number of colors are used

## Does my Problem Match this Pattern?

Yes, if these conditions are fulfilled -

1. Selecting a series of local optima allow us to reach the global optima

No, if any one of these conditions is fulfilled -

1. Making local greedy choices leads to a sub-optimal solution
2. Problem has no local optima
3. It isnt an optimisation problem

## Real-world problems

- CPU Scheduling Algorithms: Algorithms which use the greedy approach help in CPU scheduling 
- LAN Networks: In a large LAN with many switches, find a minimum spanning tree to ensure that only a minimum number of packets will be transmitted across networks
- Social Networking Websites: Applications recommend a list of people that a user may know through Djikstra's algorithm.