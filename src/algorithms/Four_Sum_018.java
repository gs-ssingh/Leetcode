package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum_018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int lo = j + 1;
                int hi = nums.length - 1;
                while (lo < hi) {
                    int sum = nums[i] + nums[j] + nums[lo] + nums[hi];
                    if (sum > target) {
                        hi--;
                    } else if (sum < target) {
                        lo++;
                    } else {
                        res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[++lo]) ;
                        while (hi > lo && nums[hi] == nums[--hi]) ;
                    }
                }
            }
        }
        return res;
    }
}
