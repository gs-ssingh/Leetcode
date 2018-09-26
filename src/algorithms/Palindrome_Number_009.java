package algorithms;

public class Palindrome_Number_009 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int num = x;
        int rev = 0;
        while (num > rev) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return num == rev || num == rev / 10;
    }

}
