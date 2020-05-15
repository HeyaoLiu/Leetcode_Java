package LC1295FindNumbersWithEvenNumberOfDigits;
//我们也可以使用语言内置的以 10 为底的对数函数 log10() 来得到整数 x 包含的数字个数。
//
//        一个包含 k 个数字的整数 x 满足不等式 10^{k-1} \leq x < 10^k10
//        k−1
//        ≤x<10
//        k
//        。将不等式取对数，得到 k - 1 \leq \log_{10}(x) < kk−1≤log
//        10
//        ​
//        (x)<k，因此我们可以用 k = \lfloor\log_{10}(x) + 1\rfloork=⌊log
//        10
//        ​
//        (x)+1⌋ 得到 x 包含的数字个数 k，其中 \lfloor a \rfloor⌊a⌋ 表示将 aa 进行下取整，例如 \lfloor 5.2 \rfloor = 5⌊5.2⌋=5。
//
//        作者：LeetCode-Solution
//        链接：https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/solution/tong-ji-wei-shu-wei-ou-shu-de-shu-zi-by-leetcode-s/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
public class Math {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num : nums) {
//            if ((int)(log10(num) + 1) % 2 == 0) {
//                ++ans;
//            }
        }
        return ans;
    }
}
