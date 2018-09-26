package algorithms;

public class String_To_Integer_008 {
    public int myAtoi(String str) {
        int res = 0;
        str = str.trim();
        if (str.length() == 0) {
            return 0;
        }
        int sign;
        if (str.charAt(0) == '-') {
            sign = -1;
            str = str.substring(1);
        } else if (str.charAt(0) == '+') {
            sign = 1;
            str = str.substring(1);

        } else {
            sign = 1;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > 47 && c < 58) {
                int dig = c - 48;
                if (sign > 0) {
                    if (res < Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && dig <= Integer.MAX_VALUE % 10)) {
                        res = res * 10 + dig;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                } else {
                    if (res * sign > Integer.MIN_VALUE / 10 || (res * sign == Integer.MIN_VALUE / 10 && dig*sign >= Integer.MIN_VALUE % 10)) {
                        res = res * 10 + dig;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                }
            } else {
                break;
            }
        }
        return res*sign;
    }

}
