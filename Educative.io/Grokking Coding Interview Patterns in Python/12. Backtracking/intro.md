# Backtracking: Introduction

- Explore multiple paths to find a solution
- Increase values with time (incrementally), and remove choices that don't contribute to the problem's solution based on some constraints
- Different from greedy algorithms in that if one path doesn't work, you backtrack and look at other options

Eg.
- Find a path of 1s from top left to bottom right, in an nxn binary maze
- Check if a knight can cover all possible squares in an nxn chessboard

## Does my Problem Match this Pattern?

Yes, if any of these conditions are fulfilled -

1. While constructing any single candidate solution, all paths must be explored. If exploring a certain path results in a dead end, we need to move back one level
2. Consider all possible solutions to select the best one
3. Compile a list of feasible solutions

No, if any one of these conditions is fulfilled -

1. If the problem structure is such that, while constructing a candidate solution, failing to meet the acceptability criteria of the solution eliminates all other possibilities within that solution. So, we don’t need to check those remaining possibilities.

## Real-world problems

- Constraint Satisfaction Problems: Sudoku
- Recursive descent parsers