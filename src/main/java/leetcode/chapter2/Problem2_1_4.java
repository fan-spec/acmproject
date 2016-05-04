package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/4.
 */
public class Problem2_1_4 {

    public static void main(String[] args) {
        Problem2_1_4 problem=new Problem2_1_4();
//        System.out.println(problem.search(new int[]{24,25,26,27,28,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,15,15,15,15,17,18,19,20,21,22,23}, 15));

        System.out.println(problem.search(new int[]{3,1,1},3));

    }

    public boolean search(int[] nums, int target) {
        if(nums.length==0||nums==null)
            return false;

        int start=0;
        int end=nums.length-1;
        for(int i=1;i<nums.length;++i){     //找出轴点
            if(nums[i]<nums[i-1]){
                if(target==nums[i-1]){
                    return true;
                }else if(target<nums[i-1]&&target>=nums[start]){
                    end=i-1;
                }else if(target==nums[i]){
                    return true;
                }else if(target>nums[i]&&target<=nums[end]){
                    start=i;
                }

                break;
            }
        }

        int mid=0;
        while(start<=end){
            mid=(end-start)/2+start;
            if(nums[mid]==target)
                return true;

            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }
        }

        return false;
    }

}
