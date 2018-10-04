package algorithms;

import java.util.Arrays;

public class Three_Sum_Closest_016 {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target - sum);
                if (diff < minDiff) {
                    minDiff = diff;
                    res = sum;
                }
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    return target;
                }
            }
        }
        return res;
    }
}
