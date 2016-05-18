package leetcode.chapter7;

/**
 * Created by yuhaozhe on 2016/5/18.
 */
public class Problem7_2 {

    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        if(nums==null)
            return 0;

        int start=0,end=nums.length-1;
        while (start <= end) {
            int mid=(start+end)/2;
            if(nums[mid]==target)
                return mid;

            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end=mid-1;
            }
        }

        return start;
    }

}
