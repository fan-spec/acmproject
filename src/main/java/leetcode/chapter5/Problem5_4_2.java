package leetcode.chapter5;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class Problem5_4_2 {

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null)
            return maxDepth(root.right)+1;
        if(root.right==null)
            return maxDepth(root.left)+1;

        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

}
