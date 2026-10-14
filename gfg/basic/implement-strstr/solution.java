class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        for(int i =0;i<=txt.length()-pat.length();i++){
            int j =0;
            while(j<pat.length() && txt.charAt(i+j)==pat.charAt(j)){
                j++;
            }
            if(j==pat.length()){
                return i;
            }
        }
        return -1;
    }
}