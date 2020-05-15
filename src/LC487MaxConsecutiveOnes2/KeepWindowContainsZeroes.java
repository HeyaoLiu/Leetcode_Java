package LC487MaxConsecutiveOnes2;
//The idea is to keep a window [l, h] that contains at most k zero
//The following solution does not handle follow-up,
// because nums[l] will need to access previous input stream
//Time: O(n) Space: O(1)
public class KeepWindowContainsZeroes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, zero = 0, k = 1; // flip at most k zero
        for (int l = 0, h = 0; h < nums.length; h++) {
            if (nums[h] == 0)
                zero++;
            while (zero > k)
                //nums[l++] access the previous value in nums array
                if (nums[l++] == 0)
                    zero--;
            max = Math.max(max, h - l + 1);
        }
        return max;
    }
}
