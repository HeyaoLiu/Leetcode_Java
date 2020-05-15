package Sort;

import java.util.Arrays;

public class Session {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,6,4,3,2,8,0,1,6};
        ArraysDemo.quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
