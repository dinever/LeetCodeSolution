/**
 * Created by dinever on 11/7/15.
 */
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = (nums1.length + nums2.length - 1) / 2;
        int m = (nums1.length + nums2.length) / 2;
        return (findKthElement(nums1, nums2, 0, 0, n) + findKthElement(nums1, nums2, 0, 0, m)) / 2.0;
    }

    private static  int findKthElement(int[] nums1, int[] nums2, int start1, int start2, int k) {
        if (start1 >= nums1.length) return nums2[start2 + k];
        if (start2 >= nums2.length) return nums1[start1 + k];

        if (k == 0) return Math.min(nums1[start1], nums2[start2]);

        int mid1 = Integer.MAX_VALUE, mid2 = Integer.MAX_VALUE;
        if (start1 + k / 2 < nums1.length) mid1 = nums1[start1 + k / 2];
        if (start2 + k / 2 < nums2.length) mid2 = nums2[start2 + k / 2];

        if (mid1 > mid2)
            return findKthElement(nums1, nums2, start1, start2 + (k + 1) / 2, k / 2);
        else
            return findKthElement(nums1, nums2, start1 + (k + 1)/ 2, start2, k / 2);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4}, b = {2, 3, 4, 5};
        double m = MedianOfTwoSortedArrays.findMedianSortedArrays(a, b);
        System.out.println(m);
    }
}
