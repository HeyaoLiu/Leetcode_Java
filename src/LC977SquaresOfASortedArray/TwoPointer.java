package LC977SquaresOfASortedArray;

public class TwoPointer {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int j=0;
        while(j<n && A[j]<0) {
            j++;
        }
        int i = j-1;

        int[] ans = new int[n];
        int count=0;

        while(i>=0 && j<n) {
            if(A[j]*A[j] > A[i]*A[i]) {
                ans[count++] = A[i]*A[i];
                i--;//donot forget
            } else {
                ans[count++] = A[j]*A[j];
                j++;//do not forget
            }
        }

        while(i>=0) {
            ans[count++] = A[i]*A[i];
            i--;
        }

        while(j<n) {
            ans[count++] = A[j]*A[j];
            j++;
        }

        return ans;
    }
}
