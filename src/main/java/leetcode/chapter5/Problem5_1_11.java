package leetcode.chapter5;

/**
 * Created by Y on 2016-05-12.
 */
public class Problem5_1_11 {

    public static void main(String[] args) {

    }

    public void flatten(TreeNode root) {
        helper(root);

    }

    public TreeNode helper(TreeNode root) {
        if(root==null)
            return null;

        TreeNode left=helper(root.left);
        TreeNode right=helper(root.right);

        if (left != null) {
            TreeNode left_end=left;
            while (left_end.right != null) {
                left_end=left_end.right;
            }

            left_end.right = right;
            left.left=null;
            root.right = left;
            root.left = null;
            return root;
        } else {
            return root;
        }

    }

}
