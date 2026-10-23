class Solution {
    public int sortPermutation(int[] nums) {
        int k = Integer.MAX_VALUE;
        boolean misplaced = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                k &= nums[i];
                misplaced = true;
            }
        }

        return misplaced ? k : 0;
    }
}