package algo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 求一个集合的所有子集
 * Created by 巫佳龙 on 2019/5/27.
 */
public class SubSet {


    public List<List<Integer>> subSet(int[] nums) {
        if (nums == null) {
            return null;
        }
        int size = nums.length;
        List<List<Integer>> subSet = new ArrayList<>(1 << size);
        for (int i = 0; i < 1 << size; i++) {
            List<Integer> sub = new ArrayList<>();
            int index = i, n = 0;
            while (index > 0) {
                if ((index & 1) == 1) {
                    sub.add(nums[n]);
                }
                index >>= 1;
                n++;
            }
            subSet.add(sub);
        }
        return subSet;
    }

}
