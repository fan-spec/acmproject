package leetcode.chapter13;

/**
 * Created by Y on 2016-05-30.
 */
public class Problem213 {

    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        if(nums.length==2)
            return nums[1]>nums[0]?nums[1]:nums[0];

        int a=nums[0];
        int b=(nums[1]>a)?nums[1]:a;
        int temp1=b;

        for(int i=2;i<nums.length-1;++i) {
            temp1=Math.max(nums[i]+a,b);

            a=b;
            b=temp1;
        }


        a=nums[1];
        b=(nums[2]>a)?nums[2]:a;
        int temp2=b;
        for(int i=3;i<nums.length;++i) {
            temp2=Math.max(nums[i]+a,b);

            a=b;
            b=temp2;
        }

        return temp1>temp2?temp1:temp2;
    }

}
