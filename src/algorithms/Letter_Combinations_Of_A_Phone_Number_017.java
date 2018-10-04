package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_Of_A_Phone_Number_017 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0){
            return res;
        }
        String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        createCombinations(map, digits, "", res, 0);
        return res;
    }

    private void createCombinations(String[] map, String digit, String str, List<String> res, int j) {
        if (j == digit.length()) {
            res.add(str);
            return;
        }
        String keys = map[Integer.parseInt(digit.substring(j, j+1))];
        for (int i = 0; i < keys.length(); i++) {
            createCombinations(map, digit, str + keys.charAt(i), res, j + 1);
        }
    }

}

