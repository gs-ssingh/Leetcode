package algorithms;

public class Roman_To_Integer_013 {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int add = 0;
            char c = s.charAt(i);
            if (c == 'I' && i + 1 != s.length() && s.charAt(i + 1) == 'V') {
                add = 4;
                i++;
            } else if (c == 'I' && i + 1 != s.length() && s.charAt(i + 1) == 'X') {
                add = 9;
                i++;
            } else if (c == 'I') {
                add = 1;
            } else if (c == 'X' && i + 1 != s.length() && s.charAt(i + 1) == 'L') {
                add = 40;
                i++;
            } else if (c == 'X' && i + 1 != s.length() && s.charAt(i + 1) == 'C') {
                add = 90;
                i++;
            } else if (c == 'X') {
                add = 10;
            } else if (c == 'C' && i + 1 != s.length() && s.charAt(i + 1) == 'D') {
                add = 400;
                i++;
            } else if (c == 'C' && i + 1 != s.length() && s.charAt(i + 1) == 'M') {
                add = 900;
                i++;
            } else if (c == 'C') {
                add = 100;
            } else if (c == 'V') {
                add = 5;
            }
            if (c == 'L') {
                add = 50;
            }
            if (c == 'D') {
                add = 500;
            }
            if (c == 'M') {
                add = 1000;
            }

            res += add;
        }
        return res;
    }
}

