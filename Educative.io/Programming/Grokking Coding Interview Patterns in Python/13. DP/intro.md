# Dynamic Programming: Introduction

- Solved using divide and conquer, recursively
- We see an optimal substructure - solution to a smaller problem helps us solve the bigger one
- Repeated overlapping substructures (eg. Fibonaccis) - Use DP to save the result once and use it whenever the subproblem is repeated
- Basically is Recursion with a cache!

Types:
1. Top-Down approach with memoization - My intuition
2. Bottom-Up approach with tabulation [Might not be applicable to all DP patterns]

Eg. 
1. Maximum matching genetic codes (Did not understand the problem statement)
2. Pascal's Triangle


## Does my Problem Match this Pattern?

Yes, if both these conditions are fulfilled -

1. Overlapping subproblems, that is, we can use the results of one subproblem when solving another, possibly larger subproblem.
2. Optimal substructure, that is, if the final solution can be constructed from the optimal solutions to its subproblems.

No, if any one of these conditions is fulfilled -

1. The problem has non-overlapping subproblems.
2. The optimal substructure property is violated.

## Real-world problems

- Load Balancer: Find the optimal way to handle a given workload by using servers with different workload handling capacities
- Search Engine: Check if white spaces can be added to a query to create valid words, in case the original query does not get any hits on the web

