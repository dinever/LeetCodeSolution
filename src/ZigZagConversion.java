/**
 * Created by dinever on 11/8/15.
 */
public class ZigZagConversion {
    public static String convert(String s, int nRows) {
        if (s.length() == 1 || nRows == 1) return s;

        StringBuilder ret = new StringBuilder();

        for (int i = 0; i < nRows; i++) {
            for (int j = i; j < s.length(); j += (2 * nRows - 2)) {
                ret.append(s.charAt(j));
                if (0 < i && i < nRows - 1) // Not the first row or the last row.
                    if (j + 2 * (nRows-1) - 2 * i < s.length())
                        ret.append(s.charAt(j + 2 * (nRows-1) - 2 * i));
            }
        }
        return ret.toString();
    }
}
