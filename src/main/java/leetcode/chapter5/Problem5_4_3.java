package leetcode.chapter5;

/**
 * Created by yuhaozhe on 2016/5/17.
 */
public class Problem5_4_3 {

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;

        return helper(root,0,sum);
    }

    public boolean helper(TreeNode node, int num, int sum) {
        if (node == null) {
            return false;
        }
        if ((node.left == null) && (node.right == null)) {
            if((num+node.val)==sum)
                return true;
            return false;
        }

        return helper(node.left,node.val+num,sum)||helper(node.right,node.val+num,sum);
    }

}
