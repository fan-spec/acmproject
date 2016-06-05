package leetcode.Tag_Tree;

/**
 * Created by Y on 2016-06-01.
 */
public class Problem337 {

    public static void main(String[] args) {

    }



    // Version of DP; Time:1188ms
    public int rob(TreeNode root) {
        if(root==null)
            return 0;

        int d1=rob(root.left)+rob(root.right);
        int d2=(root.left!=null?rob(root.left.left)+rob(root.left.right):0)
                +(root.right!=null?rob(root.right.left)+rob(root.right.right):0);

        return d1>(root.val+d2)?d1:(root.val+d2);
    }

    //Time:1ms
    public int rob_v1(TreeNode root) {
        int[] max=helper(root);
        return max[0]>max[1]?max[0]:max[1];
    }

    public int[] helper(TreeNode root) {
        if(root==null)
            return new int[]{0,0};  //1th element is the value without rob current node, 2th element is the value with rob current node.

        int[] left=helper(root.left);
        int[] right=helper(root.right);

        int[] max=new int[2];
        max[0]=(left[0]>left[1]?left[0]:left[1]) + (right[0]>right[1]?right[0]:right[1]);
        max[1]=left[0]+right[0]+root.val;

        return max;
    }
}
