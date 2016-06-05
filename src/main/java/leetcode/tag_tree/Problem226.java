package leetcode.Tag_Tree;

/**
 * Created by Y on 2016-06-01.
 */
public class Problem226 {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }

    public void helper(TreeNode root) {
        if(root==null)
            return;

        TreeNode temp=root.right;
        root.right=root.left;
        root.left=temp;

        helper(root.left);
        helper(root.right);
    }
}
