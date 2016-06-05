package leetcode.Tag_Tree;

/**
 * Created by Y on 2016-06-01.
 */
public class Problem235 {

    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode nodel=p.val<q.val?p:q;
        TreeNode noder=p.val>q.val?p:q;

        while (root != null) {
            if (root.val >= nodel.val && root.val <= noder.val) {
                return root;
            } else if (root.val < nodel.val) {
                root=root.right;
            } else if (root.val > noder.val) {
                root=root.left;
            }
        }

        return null;
    }
}
