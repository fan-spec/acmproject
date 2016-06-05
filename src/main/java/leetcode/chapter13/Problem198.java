package leetcode.chapter13;

/**
 * Created by Y on 2016-05-30.
 */
public class Problem198 {

    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];

        int a=nums[0];
        int b=(nums[1]>a)?nums[1]:a;
        int temp=b;

        for(int i=2;i<nums.length;++i) {
            temp=Math.max(nums[i]+a,b);

            a=b;
            b=temp;
        }

        return temp;
    }

}
