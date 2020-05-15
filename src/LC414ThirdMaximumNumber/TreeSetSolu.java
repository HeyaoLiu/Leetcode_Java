package LC414ThirdMaximumNumber;

import java.util.TreeSet;
//Time Complexity O(nlogn) not O(n)
//Inserting in heap is logN.
// So insertion og N elements will take nlogn changing the overall complexity of algo to nlogn
public class TreeSetSolu {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
            if (treeSet.size() > 3) {
                treeSet.remove(treeSet.first());
            }
        }
        if (treeSet.size() == 3) {
            return treeSet.first();
        }
        return treeSet.last();
    }
}
