class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int max =Integer.MIN_VALUE;
        int [] ans ={-1,-1};
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j && nums[i]>nums[j] && nums[i] +nums[j] ==target)
                {
                    int pro =nums[i]*nums[j];
                    if(pro>max){
                        max=pro;
                        ans[0]=i;
                        ans[1]=j;
                    }
                }      
                }
            }
        return ans;
        }
    }
