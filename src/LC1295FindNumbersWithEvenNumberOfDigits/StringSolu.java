package LC1295FindNumbersWithEvenNumberOfDigits;

public class StringSolu {
    //     public static String valueOf​(int i)
// Returns the string representation of the int argument.
// The representation is exactly the one returned by the Integer.toString method of one argument.
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums) {
            if(String.valueOf(num).length()%2 == 0) {
                count++;
            }
        }
        return count;
    }
}
