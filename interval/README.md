Write a function, that given two arrays A and B consisting of N elements each, returns the number of pairwise disjoint intervals constituiting the union of N interval described by arrays A and B. The K-th interval, where K is an integer within the range [0..(N-1)], is defined as (A[K], B[K]).

For example, given the following arrays A and B consisting of eight elements each:

    A[0] =  1   A[1] = 12   A[2] = 42
    A[3] = 70   A[4] = 36   A[5] = -4
    A[6] = 43   A[7] = 15

    B[0] =  5   B[1] = 15   B[2] = 44
    B[3] = 72   B[4] = 36   B[5] =  2
    B[6] = 69   B[7] = 24

the function should return 5, because the intervals described by these arrays correspond to the example above.