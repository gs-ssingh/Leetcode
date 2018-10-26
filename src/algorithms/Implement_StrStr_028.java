package algorithms;

public class Implement_StrStr_028 {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for(int i = 0 ; i < haystack.length() - needle.length() + 1; i++){
            for (int j = 0; j < needle.length() && needle.charAt(j) == haystack.charAt(i + j); j++) {
                if(j == needle.length() - 1 && needle.charAt(j) == haystack.charAt(i+j)){
                    return i;
                }
            }
        }
        return -1;
    }

}
