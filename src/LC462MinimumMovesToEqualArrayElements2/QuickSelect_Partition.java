package LC462MinimumMovesToEqualArrayElements2;

public class QuickSelect_Partition {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr, int left, int right) {
        int pivotValue = arr[right];
        int i = left;
        for(int j = left; j <= right; j++) {
            if(arr[j] < pivotValue) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, right, i);
        return i;
    }

    int select(int[] list, int left, int right, int k) {
        if (left == right) {
            return list[left];
        }
        int pivotIndex = partition(list, left, right);
        if (k == pivotIndex) {
            return list[k];
        } else if (k < pivotIndex) {
            return select(list, left, pivotIndex - 1, k);
        } else {
            return select(list, pivotIndex + 1, right, k);
        }
    }
    public int minMoves2(int[] nums) {
        int sum = 0;
        int median = select(nums, 0, nums.length - 1, nums.length / 2);

        for (int num : nums) {
            sum += Math.abs(median - num);
        }
        return sum;
    }
}
