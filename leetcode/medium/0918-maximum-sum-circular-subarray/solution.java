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