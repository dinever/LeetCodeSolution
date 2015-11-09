/**
 * Created by dinever on 11/8/15.
 */
public class ReverseInteger {
    public static int reverse(int x) {
        int ret = 0;
        boolean positive = true;
        if (x < 0) positive = false;
        while(x / 10 != 0) {
            ret = ret * 10 + x % 10;
            x = x / 10;
        }
        if (!positive) {
            if (ret < Integer.MIN_VALUE / 10) return 0;
            if (ret == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE % 10) return 0;
        } else {
            if (ret > Integer.MAX_VALUE / 10) return 0;
            if (ret == Integer.MAX_VALUE / 10 && x > Integer.MAX_VALUE % 10) return 0;
        }
        return ret * 10 + x;
    }

    public static void main(String[] args) {
        ReverseInteger.reverse(-2147483648);
    }
}
