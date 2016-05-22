package leetcode.chapter13;

/**
 * Created by Y on 2016-05-22.
 */
public class Problem53 {

    public static void main(String[] args) {
        System.out.println(new Problem53().maxSubArray(new int[]{-4,-2,-3,-1}));
    }

    public int maxSubArray(int[] nums) {
        int sum=0;
        int m=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;++i) {
            sum+=nums[i];
            m=Math.max(m,sum);

            if (sum < 0) {
                sum=0;
            }
        }

        return m;
    }



}
