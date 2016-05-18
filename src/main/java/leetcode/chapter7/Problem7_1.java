package leetcode.chapter7;

/**
 * Created by yuhaozhe on 2016/5/18.
 */
public class Problem7_1 {

    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        if(nums==null)
            return new int[]{-1,-1};

        int index=findTarget(nums,0,nums.length-1,target);
        if(index==-1)
            return new int[]{-1,-1};

        int left=index,right=index;

        while(left>=0&&nums[left]==target){--left;}
        while(right<nums.length&&nums[right]==target){++right;}

        ++left;
        --right;

        return new int[]{left,right};
    }

    public int findTarget(int[] nums, int start, int end, int target) {
        if(start>end)
            return -1;

        int mid=(start+end)/2;
        if(nums[mid]==target)
            return mid;

        int left=findTarget(nums,start,mid-1,target);
        int right=findTarget(nums,mid+1,end,target);

        return left!=-1?left:right;
    }

}
