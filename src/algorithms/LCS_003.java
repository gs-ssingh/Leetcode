package algorithms;

import java.util.HashMap;
import java.util.Map;

public class LCS_003 {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                res = Math.max(res, len);
                i = map.get(c);
                map.clear();
                len = 0;
            }else {
                map.put(c, i);
                len++;
            }
        }
        return Math.max(res, len);
    }
}
