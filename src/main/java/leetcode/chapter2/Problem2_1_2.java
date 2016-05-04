package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/4.
 */
public class Problem2_1_2 {

    public static void main(String[] args) {
        Problem2_1_2 problem=new Problem2_1_2();

        int[] nums=new int[]{1,1,1,1,3,3};
        int len=problem.removeDuplicates(nums);
        System.out.println("len: "+len);
        for(int i=0;i<len;++i){
            System.out.print(nums[i]+",");
        }
        System.out.println();

    }

    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;

        int count=0;
        int index=0;
        for(int i=1;i<nums.length;++i){
            if(count==0&&nums[index]==nums[i]){
                nums[++index]=nums[i];
                ++count;
            }else if(nums[index]!=nums[i]){
                nums[++index]=nums[i];
                count=0;
            }
        }

        return index+1;
    }

}
