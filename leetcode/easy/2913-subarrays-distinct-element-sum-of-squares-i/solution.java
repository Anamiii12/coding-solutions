
import java.util.*;

class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            List<Integer> distinct = new ArrayList<>();

            for (int j = i; j < n; j++) {
                if (!distinct.contains(nums.get(j))) {
                    distinct.add(nums.get(j));
                }

                int count = distinct.size();
                sum = sum + count * count;
            }
        }

        return sum;
    }
}
