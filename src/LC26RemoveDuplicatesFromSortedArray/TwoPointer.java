package LC26RemoveDuplicatesFromSortedArray;

public class TwoPointer {
    public int removeDuplicates(int[] nums) {
        int cur=0;
        for(int j=0; j<nums.length; j++) {
            if(j>0 && nums[j-1] == nums[j]) {
                continue;
            } else {
                nums[cur] = nums[j];
                cur++;
            }
        }
        //not cur+1, see the explanation picture
        return cur;
    }
}
