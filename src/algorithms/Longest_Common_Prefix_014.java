package algorithms;

public class Longest_Common_Prefix_014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String str = strs[j];
                if (str.length() <= i || str.charAt(i) != c) {
                    return res.toString();
                }
            }
            res.append(c);
        }
        return res.toString();
    }
}
