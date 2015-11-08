/**
 * Created by dinever on 11/8/15.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String s1 = "", s2 = "";
        String s_tmp;

        if (s.length() < 2) return s;

        for (int i = 0; i < s.length() - 1; i++) {
            s_tmp = findPalindrome(s, i, i);
            s1 = s1.length() > s_tmp.length() ? s1 : s_tmp;
            s_tmp = findPalindrome(s, i, i + 1);
            s2 = s2.length() > s_tmp.length() ? s2 : s_tmp;

        }

        return s1.length() > s2.length() ? s1 : s2;
    }

    private String findPalindrome(String s, int left, int right) {
        while (left > -1 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring a = new LongestPalindromicSubstring();
        System.out.println(a.longestPalindrome("bb"));
    }
}
