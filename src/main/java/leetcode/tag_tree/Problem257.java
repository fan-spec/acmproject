package leetcode.Tag_Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y on 2016-06-01.
 */
public class Problem257 {

    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list_rslt=new ArrayList<String>();
        if(root==null)
            return list_rslt;

        helper(root,new StringBuilder(),list_rslt);
        return list_rslt;
    }

    public void helper(TreeNode root, StringBuilder sb, List<String> list_rslt) {
        if (root.left == null && root.right == null) {
            list_rslt.add(sb.append(root.val+"").toString());
            return;
        }
        sb.append(root.val+"->");


        if (root.left != null) helper(root.left,new StringBuilder(sb),list_rslt);
        if (root.right != null) helper(root.right,new StringBuilder(sb),list_rslt);
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}