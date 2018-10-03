package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Three_Sum_015 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0, j = nums.length - 1;
        boolean flag = true;
        while (i < j) {
            int a = i, b = j;
            while (a < b) {
                int k = (a + b) / 2;
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    res.add(list);
                    break;
                } else if (sum > 0) {
                    b = k - 1;
                } else {
                    a = k + 1;
                }
            }
            if (flag) {
                i++;
                flag = !flag;
            } else {
                j--;
                flag = !flag;
            }
        }
        return res;
    }
}
