package TestArrayPro;

public class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=0, p2=0;
        while(p1<m+n) {
            if(nums1[p1] <= nums2[p2]) {
                p1++;
            } else if(p1<m+n-1 && nums1[p1] > nums2[p2]) {
                nums1[++p1] = nums1[p1];
                nums1[p1-1] = nums2[p2++];
            } else if(p1==m+n-1) {
                nums1[p1] = nums2[p2];
            }
        }
     return nums1;
    }
}
