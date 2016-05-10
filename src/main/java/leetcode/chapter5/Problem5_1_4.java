package leetcode.chapter5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuhaozhe on 2016/5/10.
 */
public class Problem5_1_4 {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> list_rslt=new ArrayList<Integer>();
        List<Integer> list_temp=new ArrayList<Integer>();
        List<TreeNode> list_node=new ArrayList<TreeNode>();
        List<TreeNode> list_node_temp=new ArrayList<TreeNode>();

        list_node.add(root);

        TreeNode ln,lr;

        while (list_node.size() > 0) {
            list_temp.clear();

            for (TreeNode node : list_node) {
                list_temp.add(node.val);

                if(node.left!=null)
                    list_node_temp.add(node.left);
                if(node.right!=null)
                    list_node_temp.add(node.right);
            }
            list_rslt.addAll(list_temp);

            list_node=list_node_temp;
            list_node_temp.clear();
        }


    }

}
