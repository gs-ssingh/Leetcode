package algorithms.select;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses_22 {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        generate(n, n, new StringBuilder(), res);
        return res;
    }

    private void generate(int op, int cl, StringBuilder list, List<String> res) {
        if (op == 0 && cl == 0) {
            res.add(list.toString());
            return;
        }

        if (op > 0) {
            generate(op - 1, cl, list.append('('), res);
            list.deleteCharAt(list.length() - 1);
        }
        if (op < cl) {
            generate(op, cl - 1, list.append(')'), res);
            list.deleteCharAt(list.length() - 1);
        }
    }
}
