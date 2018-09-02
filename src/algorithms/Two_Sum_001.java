package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum_001 {

    public int[] twoSum(int[] nums, int target) {
        int[] res = null;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                res = new int[]{map.get(target - nums[i]), i};
                break;
            }else{
                map.put(nums[i], i);
            }
        }
        return res;
    }
}
