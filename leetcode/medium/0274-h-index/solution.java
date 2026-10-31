class Solution {
    public int hIndex(int[] citations) {
        int n =citations.length;
        Arrays.sort(citations);
        for(int j=0;j<n;j++){
            int h = n-j;
            if(citations[j]>=h){
                return h;
            }
        }
        return 0;
    }
}