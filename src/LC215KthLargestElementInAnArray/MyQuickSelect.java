package LC215KthLargestElementInAnArray;

import java.util.Random;

public class MyQuickSelect {
        public int findKthLargest(int[] nums, int k) {
            if(nums == null || nums.length < k ) {
                return -1;
            }

            return select(nums, 0, nums.length-1, k);
        }
        private int select(int[] arr, int left, int right, int k){
            //new Random().nextInt(right-left)
            //bound must be positive
            //so length == 0 should be considered
            //test case arr = [1], k = 1
            if(left == right) {
                return arr[left];
            }
            int idx = partition(arr, left, right);

            if(idx == arr.length - k) {
                return arr[idx];
            } else if (idx > arr.length - k) {
                return select(arr, left, idx - 1, k);
            } else if(idx < arr.length - k) {
                return select(arr, idx + 1, right, k);
            }
            return -1;
        }

        // sort one element to its right index
        private int partition(int[] nums,int left, int right) {
            int pivotIdx = new Random().nextInt(right-left)+1+left;
            int pivotVal = nums[pivotIdx];
            swap(nums,right,pivotIdx);
            int i = left;
            for(int j=left; j<right; j++) {
                if(nums[j] < pivotVal) {
                    swap(nums, i, j);
                    i++;
                }
            }
            swap(nums, i, right);

            return i;
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        public static void main(String[] args) {
            int[] arr = new int[]{1};
            System.out.println(new MyQuickSelect().findKthLargest(arr, 1));
        }

}
