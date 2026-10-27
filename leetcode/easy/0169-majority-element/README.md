# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 82.69%)  
**Memory:** 62.5 MB (beats 48.16%)  
**Submitted:** 2026-10-27T18:01:04.270Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
        int n =nums.length;
        int candidate1=0;
        int count1=0;
        for(int num :nums)
        {
            if(num==candidate1){
                count1++;
            }
            else if(count1==0){
                candidate1=num;
                count1++;
            }
            else{
                count1--;
            }
        }
        count1=0;
        for(int num :nums){
            if(num == candidate1){
                count1++;
            }

        }
        if(count1>n/2){
            return candidate1;
        }
return -1;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)