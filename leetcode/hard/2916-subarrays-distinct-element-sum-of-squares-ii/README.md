# Subarrays Distinct Element Sum of Squares II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a  **0-indexed** integer array `nums`.

The  **distinct count**  of a subarray of `nums` is defined as:

- Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length. Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].

Return  *the sum of the  **squares**  of  **distinct counts**  of all subarrays of* `nums`.

Since the answer may be very large, return it  **modulo**  `109 + 7`.

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,2,1]
Output: 15
Explanation: Six possible subarrays are:
[1]: 1 distinct value
[2]: 1 distinct value
[1]: 1 distinct value
[1,2]: 2 distinct values
[2,1]: 2 distinct values
[1,2,1]: 2 distinct values
The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 + 22 + 22 + 22 = 15.

```

 **Example 2:** 

```
Input: nums = [2,2]
Output: 3
Explanation: Three possible subarrays are:
[2]: 1 distinct value
[2]: 1 distinct value
[2,2]: 1 distinct value
The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 = 3.
```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 226 ms (beats 35.71%)  
**Memory:** 91.3 MB (beats 75.00%)  
**Submitted:** 2026-10-16T16:05:08.708Z  

```java
class Solution {
    static final long MOD = 1_000_000_007L;

    class SegmentTree {
        int n;
        long[] sum;
        long[] squareSum;
        long[] lazy;

        SegmentTree(int n) {
            this.n = n;
            sum = new long[4 * n];
            squareSum = new long[4 * n];
            lazy = new long[4 * n];
        }

        void apply(int node, int left, int right, long val) {
            long len = right - left + 1L;

            squareSum[node] = (
                squareSum[node]
                + 2L * val % MOD * sum[node] % MOD
                + val * val % MOD * len % MOD
            ) % MOD;

            sum[node] = (sum[node] + val * len) % MOD;
            lazy[node] = (lazy[node] + val) % MOD;
        }

        void push(int node, int left, int right) {
            if (lazy[node] == 0 || left == right) {
                return;
            }

            int mid = left + (right - left) / 2;

            apply(node * 2, left, mid, lazy[node]);
            apply(node * 2 + 1, mid + 1, right, lazy[node]);

            lazy[node] = 0;
        }

        void update(int ql, int qr) {
            if (ql > qr) return;
            update(1, 0, n - 1, ql, qr);
        }

        void update(int node, int left, int right, int ql, int qr) {
            if (ql <= left && right <= qr) {
                apply(node, left, right, 1);
                return;
            }

            push(node, left, right);

            int mid = left + (right - left) / 2;

            if (ql <= mid) {
                update(node * 2, left, mid, ql, qr);
            }

            if (qr > mid) {
                update(node * 2 + 1, mid + 1, right, ql, qr);
            }

            sum[node] = (
                sum[node * 2] + sum[node * 2 + 1]
            ) % MOD;

            squareSum[node] = (
                squareSum[node * 2] + squareSum[node * 2 + 1]
            ) % MOD;
        }

        long getSquareSum() {
            return squareSum[1];
        }
    }

    public int sumCounts(int[] nums) {
        int n = nums.length;

        SegmentTree tree = new SegmentTree(n);
        int[] lastSeen = new int[100001];
        java.util.Arrays.fill(lastSeen, -1);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int previous = lastSeen[nums[i]];

            tree.update(previous + 1, i);

            ans = (ans + tree.getSquareSum()) % MOD;

            lastSeen[nums[i]] = i;
        }

        return (int) ans;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-ii/)