# Majority Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array of size `n`, find all elements that appear more than `⌊n / 3⌋` times.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: [3]

```

 **Example 2:** 

```
Input: nums = [1]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1,2]
Output: [1,2]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -109 <= nums[i] <= 109

 

 **Follow up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 73.25%)  
**Memory:** 52 MB (beats 79.04%)  
**Submitted:** 2026-10-27T18:24:43.170Z  

```java
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int candidate1=0;
        int candidate2=0;
        int count1=0;
        int count2=0;
        for(int num : nums){
            if( count1>0 && num==candidate1){
                count1++;
            }
            else if (count2>0 &&num==candidate2){
                count2++;
            }
             else if(count1==0){
                candidate1=num;
                count1=1;
            }
            else if(count2==0){
                candidate2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num :nums){
            if(num==candidate1)
            {
                count1++;
            }
            else if(num==candidate2){
                count2++;
            }
        }
        ArrayList<Integer>list = new ArrayList<>();
        if(count1>n/3){
            list.add(candidate1);
        }
        if(candidate2 != candidate1 && count2>n/3)
        {list.add(candidate2);}
        Collections.sort(list);
        return list;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element-ii/)