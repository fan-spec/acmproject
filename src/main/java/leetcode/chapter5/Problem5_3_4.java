package leetcode.chapter5;

/**
 * Created by yuhaozhe on 2016/5/16.
 */
public class Problem5_3_4 {

    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null)
            return null;

        return helper(nums,0,nums.length-1);
    }

    public TreeNode helper(int[] nums,int left,int right) {
        if(left>right)
            return null;

        int mid=(right-left)/2+left;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=helper(nums,left,mid-1);
        node.right=helper(nums,mid+1,right);

        return node;
    }

}
