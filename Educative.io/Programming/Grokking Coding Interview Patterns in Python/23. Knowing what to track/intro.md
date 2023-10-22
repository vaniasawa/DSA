# Knowing What to Track: Introduction

- Used to find the frequency count of the data, avoid the O(n^2) time by simplifying the problem and identifying certain key numeric properties in the data

Eg.
- Check if the values of the first array have corresponding squared values in the second array
- Check if two strings are anagrams
- Check if the player wins the game
- Check if there are two distinct indices within distance k such that the values are the same
- Count prefixes of a given string

## Does my Problem Match this Pattern?

Yes, if both of these conditions is fulfilled -

1. The problem seems hard with a naive approach of at least O(n^2) time complexity
2. Certain key characteristics of the input data allow us to solve the problem far more efficiently

No, if any one of these conditions is fulfilled -

1. Unable to identify key characteristics that simplify the solution
2. Problem is a variant of the problem that falls in this pattern - instead of requiring a True / False response, we’re required to locate a particular element

## Real-world problems

- Video Streaming: To enhance the video streaming user experience, revamp the continue-watching bar that will return the most frequently watched show
- E-commerce: Show product recommendations with items that are frequently viewed together