# Two Heaps

- Use either -
    1. Two min-heaps
    2. Two max-heaps
    3. Min-heap and Max-heap simultaneously

- Time taken to -
    1. Insert/Delete an element - O(log n)
    2. Access an element at the root - O(1)

Set of data can be divided into two parts -
1. First part to find the smallest element using the min-heap
2. Second part to find the largest element using the max-heap

## Does my Problem Match this Pattern?

Yes, if both these conditions are fulfilled -

1. Need to repeatedly calculate two maxima, two minima, or one maximum and one minimum, based on a changing set of data
2. The input data is NOT sorted 

No, if any one of these conditions is fulfilled -

1. We don't need to track two extreme values (minima or maxima), but only one
2. When we don't need to repeatedly calculate the extreme values (minima or maxima), but only need to calculate it a fixed number of times
3. The input data is already sorted - In which case, there is no benefit in using heaps

## Real-world problems

- Video Streaming: During a user session, it is possible that packets drop and buffering might continue. We want to record the median number of buffering events that might occur in a particular session, which could then be used to improve the user experience
- Netflix: Median age of our viewers - Should be uploaded efficiently when a new user signs up for video streaming.
