package leetcode.chapter2;

/**
 * Created by yuhaozhe on 2016/5/4.
 */
public class Problem2_1_3 {

    public static void main(String[] args) {
        Problem2_1_3 problem=new Problem2_1_3();

        long start1=System.currentTimeMillis();
        System.out.println(problem.search_v2(new int[]{24,25,26,27,28,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23}, 2));
        long end1=System.currentTimeMillis();
        System.out.println("time: "+(end1-start1));

        long start2=System.currentTimeMillis();
        System.out.println(problem.search_v3(new int[]{24,25,26,27,28,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23}, 2));
        long end2=System.currentTimeMillis();
        System.out.println("time: "+(end2-start2));




    }

    public int search_v1(int[] nums, int target){
        if(nums.length==0||nums==null)
            return -1;

        for(int i=0;i<nums.length;++i){
            if(target==nums[i])
                return i;
        }

        return -1;
    }

    public int search_v2(int[] nums, int target) {
        if(nums.length==0||nums==null)
            return -1;

        int start=0;
        int end=nums.length-1;
        for(int i=1;i<nums.length;++i){     //找出轴点
            if(nums[i]<nums[i-1]){
                if(target==nums[i-1]){
                    return i-1;
                }else if(target<nums[i-1]&&target>=nums[start]){
                    end=i-1;
                }else if(target==nums[i]){
                    return i;
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
                return mid;

            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }
        }

        return -1;
    }

    public int search_v3(int[] nums, int target){
        if(nums.length==0||nums==null)
            return -1;

        int start=0;
        int end=nums.length-1;
        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;

            if(nums[mid]==target)
                return mid;

            if(nums[mid]<nums[end]){
                if(target>nums[mid]&&target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(target<nums[mid]&&target>=nums[start]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }

        return -1;
    }

}
