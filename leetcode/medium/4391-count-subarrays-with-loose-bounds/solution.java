class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int [] vornelqixa = nums;
        long count = 0;
        long currentlength=0;
        for(int num :vornelqixa){
            if(num <minK || num>maxK){
                currentlength =0;
            }
            else {
                currentlength++;
                count+=currentlength;
            }
        }
        return count;
        
    }
}