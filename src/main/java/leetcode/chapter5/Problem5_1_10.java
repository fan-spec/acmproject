package leetcode.chapter5;

/**
 * Created by yuhaozhe on 2016/5/11.
 */
public class Problem5_1_10 {

    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;

        return length(root)>=0;

    }

    public int length(TreeNode root) {
        if(root==null)
            return 0;

        int len_left=length(root.left);
        int len_right=length(root.right);

        if(len_left<0||len_right<0)
            return -1;
        if(Math.abs(len_left-len_right)>=2)
            return -1;

        return len_left>len_right?len_left+1:len_right+1;

    }

}
