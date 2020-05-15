package Sort;


import java.util.Random;

public class ArraysDemo {
    public static void quickSort(int[] arr) {
        if(arr == null || arr.length <=1) {
            return;
        }

        sort(arr, 0, arr.length-1);
    }

    private static /*int*/void sort(int[] arr, int from, int to) {

        if(from < to) {
            int idx = partition(arr, from, to);

            /*if(idx == arr.length/2){
                return arr[idx];
            }*/

            sort(arr, from, idx-1);
            sort(arr, idx+1, to);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivotIdx = new Random().nextInt(right-left) + 1+ left;
        int pivotVal = arr[pivotIdx];
        swap(arr, pivotIdx, right);
        int savedPosition = right;

        //start the pointer from index of length - 2
        right--;
        while(left<=right) {
            if(arr[left] <= pivotVal) {
                left++;
            } else {
                swap(arr, left, right);
                right--;
            }
        }
        //换值
        swap(arr, left, savedPosition);
        //left跳过的位置一定都是判断完arr[left] <= pivotVal的位置，
        // 所以返回left指针的索引保证left之前的位置都满足<= pivotVal
        return left;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
