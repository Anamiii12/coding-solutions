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