package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/4.
 */
public class Problem2_1_1 {

    public static void main(String[] args) {
        Problem2_1_1 problem=new Problem2_1_1();

        int[] nums=new int[]{1,1,2,3,5};
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

        int index=0;
        for(int i=1;i<nums.length;++i){
            if(nums[index]!=nums[i]){
                nums[++index]=nums[i];
            }
        }

        return index+1;
    }

}
