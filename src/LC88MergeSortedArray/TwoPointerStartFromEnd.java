package LC88MergeSortedArray;

public class TwoPointerStartFromEnd {
    //public static void arraycopy (Object src, int srcPos, Object dest, int destPos, int length)
// Copies an array from the specified source array, beginning at the specified position,
//to the specified position of the destination array.
//A subsequence of array components are copied from the source array referenced by src to the destination array referenced by dest.
//The number of components copied is equal to the length argument.

    //https://leetcode.com/articles/merge-sorted-arrays/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // two get pointers for nums1 and nums2
        int p1 = m - 1;
        int p2 = n - 1;
        // set pointer for nums1
        int p = m + n - 1;

        // while there are still elements to compare
        while ((p1 >= 0) && (p2 >= 0))
            // compare two elements from nums1 and nums2
            // and add the largest one in nums1
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
