package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/4.
 */
public class Problem2_1_11 {
    public static void main(String[] args) {
        Problem2_1_11 problem=new Problem2_1_11();

        System.out.println(problem.removeElement_v2(new int[]{4},3));
        System.out.println(problem.removeElement_v1(new int[]{4},3));

    }

    public int removeElement_v2(int[] nums, int val) {
        int index=0,i;
        for(i=0;i<nums.length;++i){
            if(nums[i]!=val){
                nums[index++]=nums[i];
            }
        }

        return index;
    }

    public int removeElement_v1(int[] nums, int val) {
        if(nums.length==0||nums==null)
            return 0;


        int end=nums.length-1;
        for(int i=0;i<=end;){

            if(nums[i]==val){
                int temp=nums[i];
                nums[i]=nums[end];
                nums[end]=temp;

                --end;
            }else{
                ++i;
            }

        }

        return end+1;
    }

}
