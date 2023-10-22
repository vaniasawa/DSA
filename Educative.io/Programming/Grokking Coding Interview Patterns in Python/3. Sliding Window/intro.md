# Sliding Window

- Reduce the use of nested loops in an algorithm
- Variation of the two pointers pattern (used to set window bounds)
- Process data in segments, instead of the entire list

## Does my Problem Match this Pattern?

Yes, If

1. Problem requires repeated computations on a contiguous set of data elements (subarray or a substring). Size of the window may be fixed/variable.
2. Computations take O(1) time or are a slow growing function. k << n

No, if

1. Input data structure does not support random access
2. You have to process the entire data without segmentation

## Real World Problems
- Telecommunications - Find the max number of users connected to a cellular network's base station every k-milliseconds
- E-commerce - Given a dataset of product IDs in the order they were viewed by the user and a list of products that are likely to be similar, find how many times these products occur together in the dataset
- Video Streaming - Given a stream of numbers representing the number of buffering events in a given user session, calculate the median number of buffering events in a one-minute interval
- Social Media Content Mining - Given the lists of topics that two users have posted about, find the shortest sequence of posts by one user that includes all the topics that the other user has posted about.

