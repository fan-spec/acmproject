package leetcode.Tag_Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y on 2016-06-01.
 */
public class Problem199 {

    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list_rslt=new ArrayList<Integer>();
        if(root==null)
            return list_rslt;

        ArrayList<TreeNode> list_root=new ArrayList<TreeNode>();
        ArrayList<TreeNode> list_child=new ArrayList<TreeNode>();
        list_root.add(root);

        while (!list_root.isEmpty()) {
            list_rslt.add(list_root.get(list_root.size()-1).val);

            for (TreeNode node : list_root) {
                if(node.left!=null) list_child.add(node.left);
                if(node.right!=null) list_child.add(node.right);
            }

            list_root=list_child;
            list_child=new ArrayList<TreeNode>();
        }

        return list_rslt;
    }

}
