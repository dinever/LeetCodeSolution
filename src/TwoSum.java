import java.util.HashMap;

/**
 * Created by dinever on 11/5/15.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = {0, 0};

        final HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(target - nums[i])) {
                int index = h.get(target-nums[i]);
                res[0] = Math.min(i, index) + 1;
                res[1] = Math.max(i, index) + 1;
                break;
            }
            h.put(nums[i], i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target =  6;
        System.out.println(twoSum(nums, target)[0]);
        System.out.println(twoSum(nums, target)[1]);
    }
}
