# Hash Maps: Introduction

- Used for storing data - Aim to reduce time to find and access values
- Store data in the form of key-value pairs
- Array values are stored against numeric keys - Keys are known as indices.
- We don't get to pick the values of these keys - sequential integers starting from 0.
- Each key is unique and mapped to a value - O(1) time

Eg.
- Check for a pair in an array with a target sum (Two Sum)
- Find the occurence of every word in a string

## Does my Problem Match this Pattern?

Yes, if both of these conditions is fulfilled -

1. Require repeated fast access to data during the execution of the algorithm
2. Store the relationship between two sets of data, to compute the required result

No, if any one of these conditions is fulfilled -

1. No useful relation can be established between two sets of data

## Real-world problems

- Telecommunications: Phone Book
- E-commerce: Details of a product using its product ID as the key
- File System: File Name + Path