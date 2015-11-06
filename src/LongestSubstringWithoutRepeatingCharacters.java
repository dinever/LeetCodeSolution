import java.util.*;

/**
 * Created by dinever on 11/5/15.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)) {
                int index = map.get(cur);
                start = Math.max(index + 1, start);
            }
            maxLength = Math.max(maxLength, i - start + 1);
            map.put(cur, i);
        }
        return maxLength;
    }
}
