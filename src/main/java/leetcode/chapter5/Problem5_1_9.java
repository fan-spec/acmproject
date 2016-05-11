package leetcode.chapter5;

/**
 * Created by yuhaozhe on 2016/5/11.
 */
public class Problem5_1_9 {

    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null))
            return true;

        if (root.left != null && root.right != null) {
            mirrorRevers(root.right);
            return isSameTree(root.left,root.right);
        }

        return false;
    }

    public void mirrorRevers(TreeNode root) {
        if(root==null)
            return;

        if(root.left!=null)
            mirrorRevers(root.left);
        if(root.right!=null)
            mirrorRevers(root.right);

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        if(p==null||q==null)
            return false;
        if(p.val!=q.val)
            return false;

        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }


}
