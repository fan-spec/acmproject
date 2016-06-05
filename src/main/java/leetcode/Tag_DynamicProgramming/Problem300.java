package leetcode.Tag_DynamicProgramming;

/**
 * Created by Y on 2016-06-03.
 */
public class Problem300 {


    public static void main(String[] args) {
        System.out.println(new Problem300().lengthOfLIS(new int[]{2,2}));
    }

    public int lengthOfLIS(int[] nums) {
        if(nums==null|nums.length==0)
            return 0;
        if(nums.length==1)
            return 1;


        int[] d=new int[nums.length];
        d[0]=1;
        int max=1;

        for(int i=1;i<nums.length;++i) {
            d[i]=1;
            for(int j=i-1;j>=0;--j) {
                if (nums[i] >nums[j]) {
                    d[i]=(d[i]>d[j]?d[i]:d[j])+1;
                }
            }





            max=max>d[i]?max:d[i];
        }

        return max;
    }


}
