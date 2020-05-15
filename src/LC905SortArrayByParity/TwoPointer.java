package LC905SortArrayByParity;

public class TwoPointer {
    public int[] sortArrayByParity(int[] A) {
        int cur=0;
        for(int i=0; i<A.length; i++) {
            if(A[i]%2 == 0) {
                int temp = A[i];
                A[i] = A[cur];
                A[cur++] = temp;
            }
        }
        return A;
    }
}
