package LC414ThirdMaximumNumber;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetSolu {
    public int thirdMax(int[] nums) {
        Set<Integer> max = new HashSet<>();
        for(int num:nums) {
            max.add(num);
            if(max.size() > 3) {
                max.remove(Collections.min(max));
            }
        }
        if(max.size() == 3) {
            return Collections.min(max);
        }
        return Collections.max(max);
    }
}
