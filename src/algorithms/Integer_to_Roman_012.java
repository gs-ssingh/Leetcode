package algorithms;

public class Integer_to_Roman_012 {
    public String intToRoman(int num) {
        int[] bases = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String res = "";
        for (int i = 0; i < bases.length && num > 0; i++) {
            int base = bases[i];
            int count = num / base;
            for (int j = 0; j < count; j++) {
                res += romans[i];
            }
            if (count > 0) {
                num = num % base;
            }
        }
        return res;
    }
}
