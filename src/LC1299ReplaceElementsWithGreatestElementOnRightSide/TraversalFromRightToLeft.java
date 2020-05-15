package LC1299ReplaceElementsWithGreatestElementOnRightSide;

public class TraversalFromRightToLeft {
    //https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/solution/cong-you-wang-zuo-yi-ci-bian-li-by-lirunjun/
    //if construct the array from left to right, TC O(N^2);
    //construct array from right to left, TC O(N).
    //Because you know the max value of the right side, one for loop is enough.
    public int[] replaceElements(int[] arr) {
        int rightMax = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int t = arr[i];
            arr[i] = rightMax;
            if (t > rightMax)
                rightMax = t;
        }
        return arr;
    }
}
