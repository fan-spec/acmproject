package leetcode.Tag_DynamicProgramming;

/**
 * Created by Y on 2016-06-02.
 */
public class Problem303 {

    public static void main(String[] args) {

    }

}

class NumArray {
    private int[] d;

    public NumArray(int[] nums) {
        d=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;++i) {
            sum+=nums[i];
            d[i]=sum;
        }
    }

    public int sumRange(int i, int j) {
        return i==0?d[j]:(d[j]-d[i-1]);
    }
}