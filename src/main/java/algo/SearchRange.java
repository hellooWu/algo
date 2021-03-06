package algo;

/**
 *
 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

 你的算法时间复杂度必须是 O(log n) 级别。

 如果数组中不存在目标值，返回 [-1, -1]。

 示例 1:

 输入: nums = [5,7,7,8,8,10], target = 8
 输出: [3,4]
 示例 2:

 输入: nums = [5,7,7,8,8,10], target = 6
 输出: [-1,-1]
 * Created by 巫佳龙 on 2019/5/29.
 */
public class SearchRange {


    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int left = left(nums, target);
        int right = right(nums, target);
        if (left > nums.length - 1 || right < 0 || nums[left] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{left, right};
    }


    int right(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = high - ((high - low) >> 1);
            if (target >= nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low - 1;
    }

    int left(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = high - ((high - low) >> 1);
            if (target < nums[mid] || target == nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high + 1;
    }



}
