package leetcode.chapter13;

/**
 * Created by Y on 2016-05-22.
 */
public class Problem53 {    //not completed

    public static void main(String[] args) {

        System.out.println("\n"+new Problem53().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

    }

    public int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];


        int last=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<nums.length;++i) {
            last=last<0?nums[i]:(last+nums[i]);

            if(maxSum<last)
                maxSum=last;

        }

        return maxSum;
    }



}
