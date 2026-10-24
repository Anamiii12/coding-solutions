class Solution {
    public int peakValleyDifference(int[] nums) {
        int total =0;
        for(int i =1;i<nums.length-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){total = total +nums[i];}
            else if(nums[i]<nums[i-1] &&nums[i]<nums[i+1]){total-=nums[i];}
        }
        return total;
    }
    
}