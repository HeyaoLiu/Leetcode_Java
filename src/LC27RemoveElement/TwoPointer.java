package LC27RemoveElement;

public class TwoPointer {
    public int removeElement(int[] nums, int val) {
        int cur=0, pos=0;
        while(pos < nums.length) {
            if(nums[pos] == val) {
                pos++;
            } else if(nums[pos] != val) {
                nums[cur] = nums[pos];
                cur++;
                pos++;
            }
        }
        //note cur not cur+1, because last time you maybe get cur++,
        //but while will end, so you do not examine the cur,
        // so the sum of cur is from 0 to cur-1
        //EX [3,2,2,2]
        return cur;
    }
}
