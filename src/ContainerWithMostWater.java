/**
 * Created by dinever on 11/12/15.
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int lo = 0;
        int hi = height.length - 1;
        while (lo < hi) {
            maxArea = Math.max(maxArea, (hi - lo) * Math.min(height[hi], height[lo]));
            if (height[lo] > height[hi]) {
                hi--;
            } else {
                lo++;
            }
        }
        return maxArea;
    }
}
