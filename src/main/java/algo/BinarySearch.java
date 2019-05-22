package algo;

import java.util.concurrent.CountDownLatch;

/** 二分查找
 * @author wu
 * @date 2019/2/14 11:18
 * @remark
 */
public class BinarySearch {


    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int mid = (low + high) >> 1;
        while (low <= high) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) >> 1;
        }
        return -1;
    }




}
