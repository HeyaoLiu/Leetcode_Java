package LC747LargestNumberAtLeastTwiceOfOthers;

//设置 one、two 表示最大值和第二大值的数字；
//设置 oneIndex 表示最大值的索引；
//通过 for 遍历 nums；
//遍历 nums 过程中：如果这个数 nums[i] 比最大值还大，那么替换掉 two、one、oneIndex；如果这个数 nums[i] 比第二大值还大，那么替换掉第二大值 two。
//判断 one 是否大于或者等于 two * 2，返回 oneIndex 或者 -1。
public class OnePass_RecordTwoValue {
//    const dominantIndex = (nums) => {
//        let one = 0;
//        let oneIndex = 0;
//        let two = 0;
//        for (let i = 0; i < nums.length; i++) {
//            if (nums[i] > one) {
//                two = one;
//                one = nums[i];
//                oneIndex = i;
//            } else if (nums[i] > two) {
//                two = nums[i];
//            }
//        }
//        return one >= two * 2 ? oneIndex : -1;
//    };
}
