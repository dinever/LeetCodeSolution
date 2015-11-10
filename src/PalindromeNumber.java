/**
 * Created by dinever on 11/10/15.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        int reversed = 0;
        int original = x;
        while(x >= 10) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        if (original / 10 == reversed && original % 10 == x) return true;
        else return false;
    }
}
