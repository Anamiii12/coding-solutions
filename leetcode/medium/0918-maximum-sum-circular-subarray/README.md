# Maximum Sum Circular Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a  **circular integer array**  `nums` of length `n`, return  *the maximum possible sum of a non-empty  **subarray**  of* `nums`.

A  **circular array**  means the end of the array connects to the beginning of the array. Formally, the next element of `nums[i]` is `nums[(i + 1) % n]` and the previous element of `nums[i]` is `nums[(i - 1 + n) % n]`.

A  **subarray**  may only include each element of the fixed buffer `nums` at most once. Formally, for a subarray `nums[i], nums[i + 1],..., nums[j]`, there does not exist `i <= k1`, `k2 <= j` with `k1 % n == k2 % n`.

 

Original
Java
 **Example 1:** 

```
Input: nums = [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3.

```

 **Example 2:** 

```
Input: nums = [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.

```

 **Example 3:** 

```
Input: nums = [-3,-2,-3]
Output: -2
Explanation: Subarray [-2] has maximum sum -2.

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 3 * 104
- -3  *104 <= nums[i] <= 3*  104

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 28.13%)  
**Memory:** 50.6 MB (beats 85.84%)  
**Submitted:** 2026-11-10T14:02:10.845Z  

```java
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int minsum= nums[0];
        int currentmax= 0;
        int currentmin =0;
        int totalsum =0;
        for(int i =0;i<nums.length;i++){
            currentmax = Math.max(nums[i] ,  currentmax + nums[i]);
            maxsum = Math.max(currentmax,maxsum);
            currentmin = Math.min(nums[i], currentmin+nums[i]);
            minsum = Math.min(minsum , currentmin);
            totalsum +=nums[i];
        }
        if(maxsum <0){
            return maxsum;
        }
        return Math.max(maxsum,totalsum - minsum);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-sum-circular-subarray/)